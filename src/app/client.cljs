(ns app.client
  (:require
   [com.fulcrologic.fulcro.application :as app]
   [com.fulcrologic.fulcro.components :as comp :refer [defsc]]
   [com.fulcrologic.fulcro.dom :as dom]))

(defsc Sample [this props]
  {}
  (dom/div "Hello World"))



(def APP (app/fulcro-app))

(defn ^:export init []
  (app/mount! APP Sample "app"))

(defn f [x x]
  (* x x))