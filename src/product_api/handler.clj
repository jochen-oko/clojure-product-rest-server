(ns product-api.handler
  (:use compojure.core)
  (:require [compojure.handler :as handler]))

(defn- load-product [id]
  (try
     (slurp (str "resources/" id ".json"))
     (catch Exception e (println (str "caught exception: " (.getMessage e))))))

(defroutes app
  (GET "/product/id/:id" [id] (load-product id)))
