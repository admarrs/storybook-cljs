(ns stories.home-stories
  (:require
   [reagent.core :as r]
   [storycljs.core :refer [home-page]]))

(def ^:export default
  (clj->js
   {:title "Cljs/Home"
    :component (r/reactify-component home-page)
    :parameters {}
    :args {}}))

(defn ^:export home-basic []
  (r/as-element
   [home-page]))
