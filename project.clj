(defproject org.braidchat.www "0.0.1"
  :source-paths ["src"]

  :dependencies [[org.clojure/clojure "1.7.0"]
                 [http-kit "2.1.19"]
                 [ring/ring-devel "1.4.0"]
                 [compojure "1.4.0"]
                 [hiccup "1.0.5"]
                 [garden "1.3.2"]]

  :main site.handler
  )
