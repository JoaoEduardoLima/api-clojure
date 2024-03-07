(ns api-rest.core
  (:require 
   [ring.adapter.jetty :as jetty]
   [ring.middleware.cookies :refer [wrap-cookies]])
  (:gen-class))

(defn handler [request]
  (when (= (:uri request) "/teste")
    (let [visit (get-in request [:cookies "visit" :value])]
      (if visit
        {:status 200
         :headers {"Content-Type" "text/plain; charset=utf-8"}
         :body (str "Você já visitou " visit " vezes")
         :cookies {:visit {:value (inc (read-string visit))
                           :max-age 30}}}
        {:status 200
         :headers {"Content-Type" "text/html; charset=utf-8"}
         :body (slurp "src/api_rest/index.html")
         :cookies {:visit {:value 1
                           :max-age 30}}}))))
(defn -main
  [& args]
  (jetty/run-jetty (wrap-cookies handler) {:port 3003}))