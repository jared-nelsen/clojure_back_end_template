(ns my-project.core
  (:gen-class)
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.params :refer [wrap-params]]
            [ring.middleware.json :refer [wrap-json-body wrap-json-response]]
            [ring.middleware.defaults :refer [wrap-defaults api-defaults]]
            [ring.middleware.cors :refer [wrap-cors]]
            [ring.adapter.jetty :as ring-jetty]))

(defroutes app-routes
  (GET "/" [] "Hello People of Earth!")
  (route/not-found "Not Found"))

(def app
  (-> (wrap-defaults app-routes api-defaults)
      (wrap-params)
      (wrap-json-body)
      (wrap-json-response)
      (wrap-cors :access-control-allow-origin [#".*"]
                 :access-control-allow-methods [:get :put :post :delete]
                 :access-control-allow-headers [:all])))

(defn -main
  []
  (let [systemPort (System/getenv "PORT")
        port (if (nil? systemPort) 3000 (Integer/parseInt systemPort))]
    (println (str "App started! ... Port: " port))
    (ring-jetty/run-jetty app {:port port})))
