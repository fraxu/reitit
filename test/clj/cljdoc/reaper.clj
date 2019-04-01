(ns cljdoc.reaper
  (:require [clojure.java.io :as io]
            [clojure.pprint :as pprint]
            [clojure.string :as str]))

(defn reap! []
  (let [docs (->> (for [line (-> (io/file "./doc/SUMMARY.md") (slurp) (str/split #"\n"))
                        :let [data (-> (re-seq #"^(.*)\* \[(.*)\]\((.*)\)" line) first rest seq)]
                        :when data]
                    (let [[indent name file] data
                          wrap (if (pos? (count indent)) vector identity)]
                      (wrap [name {:file (str "doc/" file)}])))
                  (reduce
                    (fn [acc data]
                      (if (vector? (first data))
                        (update-in acc [(dec (count acc)) 2] (fnil into []) data)
                        (conj acc data))
                      ) [])
                  ;; third sweep to flatten chids...
                  (mapv (fn [[n o c]] (if c (into [n o] c) [n o]))))
        data {:cljdoc/include-namespaces-from-dependencies ['reitit/reitit
                                                            'reitit/reitit-core
                                                            'reitit/reitit-ring
                                                            'reitit/reitit-spec
                                                            'reitit/reitit-schema
                                                            'reitit/reitit-swagger
                                                            'reitit/reitit-swagger-ui
                                                            'reitit/reitit-frontend
                                                            'reitit/reitit-middleware]
              :cljdoc.doc/tree docs}]
    (spit "doc/cljdoc.edn" (with-out-str (pprint/pprint data)))))

(comment
  (reap!))
