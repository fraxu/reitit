(defproject reitit/reitit-core "0.3.8"
  :description "Snappy data-driven router for Clojure(Script)"
  :url "https://github.com/metosin/reitit"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :scm {:name "git"
        :url "https://github.com/metosin/reitit"
        :dir "../.."}
  :plugins [[lein-parent "0.3.3"]]
  :parent-project {:path "../../project.clj"
                   :inherit [:deploy-repositories :managed-dependencies]}
  :java-source-paths ["java-src"]
  :dependencies [[meta-merge]])
