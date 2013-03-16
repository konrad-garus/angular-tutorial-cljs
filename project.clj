(defproject angular-tutorial-cljs "0.1.0"
  :description "Angular Tutorial Rewritten to ClojureScript"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [ring "1.1.8"]
                 [compojure "1.1.5"]
                 [lib-noir "0.4.6"]]
  :plugins [[lein-cljsbuild "0.3.0"]]
  :hooks [leiningen.cljsbuild]
  :source-paths ["src/clj"]
  :cljsbuild { 
    :builds {
      :main {
        :source-paths ["src/cljs"]
        :compiler {:output-to "resources/public/js/cljs.js"
                   :optimizations :advanced
                   :pretty-print true
                   :externs ["externs/angular.js"]}
        :jar true}}}
  :main tutorial.server)
