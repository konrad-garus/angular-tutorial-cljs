(ns tutorial.server
  (:require [ring.adapter.jetty :as jetty]
            [ring.middleware.resource :as resources]
            [ring.util.response :as response]
            [compojure.core :refer [GET defroutes]]
            [compojure.handler :refer [site]]
            [noir.response :refer [json]]
            [tutorial.phones :refer [phones phone-details]])
  (:gen-class))

(defroutes app
  (GET "/app/phones" [] (json phones))
  (GET "/app/phones/:phone" [phone] (json (phone-details (keyword phone)))))

(def handler
  (-> app
    site
    (resources/wrap-resource "public")))

(defn -main [& args]
  (jetty/run-jetty handler {:port 3000}))
