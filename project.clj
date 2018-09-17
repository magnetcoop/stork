(defproject magnetcoop/stork "0.1.2"
  :description "Idempotent and atomic datom transacting for Datomic. Heavily inspired on rkneufeld/conformity."
  :url "http://github.com/magnetcoop/stork"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :min-lein-version "2.8.1"
  :profiles {:dev {:dependencies [[org.clojure/clojure "1.9.0"]
                                  [com.datomic/datomic-free "0.9.5697"]
                                  [org.clojure/tools.namespace "0.2.3"]]
                   :source-paths ["dev"]}}
  :deploy-repositories [["snapshots" {:url "https://clojars.org/repo"
                                      :username :env/clojars_username
                                      :password :env/clojars_password}]
                        ["releases"  {:url "https://clojars.org/repo"
                                      :username :env/clojars_username
                                      :password :env/clojars_password}]])
