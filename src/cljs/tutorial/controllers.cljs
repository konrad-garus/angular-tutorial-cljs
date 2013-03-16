(ns tutorial.controllers)

(defn ^:export phone-list-ctrl [$scope Phone]
  ; Unfortunately, with custom actions (like Phone.query) the advanced 
  ; compilation will lose the name, so we have to get it by string explicitly
  (aset $scope "phones" ((aget Phone "query")))
  (aset $scope "orderProp" "age"))

(aset phone-list-ctrl "$inject" (array "$scope" "Phone"))

(defn ^:export phone-detail-ctrl [$scope $routeParams Phone]
  ; Setting $scope.phone from "right hand side" and $scope.mainImageUrl 
  ; from success callback is nuts, but that's what the tutorial does
  (aset $scope "phone" (.get Phone 
                         (clj->js {:phoneId (aget $routeParams "phoneId")})
                         (fn [phone] (aset $scope "mainImageUrl" (first (.-images phone))))))
  (aset $scope "setImage" (partial aset $scope "mainImageUrl")))

(aset phone-detail-ctrl "$inject" (array "$scope" "$routeParams" "Phone"))
