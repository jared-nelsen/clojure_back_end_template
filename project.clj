(defproject prio_backend "1.0.0"
  :description "TITLE"
  :url "HOME"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [compojure "1.7.0"]
                 [cheshire "5.11.0"]
                 [ring/ring-defaults "0.3.4"]
                 [ring-cors "0.1.13"]
                 [ring/ring-json "0.5.1"]]
  :plugins [[lein-ring "0.12.6"]]
  :ring {:handler prio-backend.handler/app
         :open-browser? false} 
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring/ring-mock "0.4.0"]]}})
