(ns tutorial.filters)

(doto (angular/module "phonecatFilters" (array))
  (.filter "checkmark" 
    (fn []
      (fn [input]
        (if input "\u2713" "\u2718")))))
