(ns site.handler
  (:require [site.pages.index]
            [org.httpkit.server :refer [run-server]]
            [compojure.route :refer [resources]]
            [compojure.core :refer [GET POST routes defroutes context]]
            [ring.middleware.reload :as reload]))

(defroutes site-routes
  (GET "/" _
    site.pages.index/html))

(def app
  (-> (routes
        (resources "/")
        (reload/wrap-reload #'site-routes))))

(defonce server (atom nil))

(defn stop-server!
  []
  (when-let [stop-fn @server]
    (stop-fn :timeout 100)))

(defn start-server!
  [port]
  (stop-server!)
  (reset! server (run-server #'app {:port port})))
