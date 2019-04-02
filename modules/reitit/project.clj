(defproject reitit/reitit "0.35"
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
  :dependencies [[reitit/reitit-core]
                 [reitit/reitit-dev]
                 [reitit/reitit-spec]
                 [reitit/reitit-schema]
                 [reitit/reitit-ring]
                 [reitit/reitit-middleware]
                 [reitit/reitit-http]
                 [reitit/reitit-interceptors]
                 [reitit/reitit-swagger]
                 [reitit/reitit-swagger-ui]
                 [reitit/reitit-frontend]
                 [reitit/reitit-sieppari]])
