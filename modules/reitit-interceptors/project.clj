(defproject reitit/reitit-interceptors "0.3.8"
  :description "Reitit, common interceptors bundled"
  :url "https://github.com/metosin/reitit"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :scm {:name "git"
        :url "https://github.com/metosin/reitit"
        :dir "../.."}
  :plugins [[lein-parent "0.3.3"]]
  :parent-project {:path "../../project.clj"
                   :inherit [:deploy-repositories :managed-dependencies]}
  :dependencies [[reitit/reitit-ring]
                 [lambdaisland/deep-diff]
                 [metosin/muuntaja]])
