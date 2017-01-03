(defproject product-api "0.1.0-SNAPSHOT"
  :description "Clojure Rest server, that returns some product test data."
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [ring/ring-core "1.2.1"]
                 [ring/ring-jetty-adapter "1.2.1"]
                 [compojure "1.1.8"]]
  :plugins [[ikitommi/lein-ring "0.9.8-FIX"]]
  :ring {:handler product-api.handler/app}
  :profiles {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring-mock "0.1.5"]]}})
