(ns tutorial.app
  (:require [tutorial.controllers :as ctrl]))

(defn ng-route [provider path route-spec]
  (.when provider path (clj->js route-spec)))

(defn ng-route-otherwise [provider route-spec]
  (.otherwise provider (clj->js route-spec)))

(doto (angular/module "phonecat" (array "phonecatFilters" "phonecatServices"))
  (.config (array "$routeProvider" 
                  (fn [$routeProvider]
                    (doto $routeProvider
                      (ng-route "/phones" {:templateUrl "partials/phone-list.html"
                                           :controller ctrl/phone-list-ctrl})
                      (ng-route "/phones/:phoneId" {:templateUrl "partials/phone-detail.html"
                                                    :controller ctrl/phone-detail-ctrl})
                      (ng-route-otherwise {:redirectTo "/phones"}))))))
