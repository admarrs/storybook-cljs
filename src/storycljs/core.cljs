(ns storycljs.core
  (:require
   [reagent.dom.client :refer [create-root]]
   [reagent.core :as r]))

;; -------------------------
;; Views


(defn home-page []
  [:div {:class "w-3/6 bg-white rounded-lg shadow"}
   [:h1 {:class "p-2 text-xl font-bold text-red-800"} "Welcome to Reagent"]
   [:h2 {:class "p-2 text-lg italic"} "Subtitle"]
   [:p {:class "p-2"} "Fusce sagittis, libero non molestie mollis, magna orci ultrices dolor, at vulputate neque nulla lacinia eros."]])

;; -------------------------
;; Initialize app

(defn mount-root []
  (let [root (create-root (.getElementById js/document "app"))]
    (.render root (r/as-element [home-page]))))

(defn ^:export init! []
  (mount-root))
