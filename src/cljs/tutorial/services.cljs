(ns tutorial.services)

(doto (angular/module "phonecatServices" (array "ngResource"))
  (.factory "Phone"
    (array "$resource"
           (fn [$resource]
             ($resource 
               "app/phones/:phoneId" 
               (clj->js {}) 
               (clj->js {:query {:method "GET" :params {:phoneId ""} :isArray true}}))))))
