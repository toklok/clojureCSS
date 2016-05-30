(ns garden-css.core
  (:require [garden.def :refer [defstylesheet defstyles]]
            [garden.units :refer [px]]
            [garden.selectors]
            [mesh.grid :as grid]))


;; Change defstylesheet to defstyles.
(defstyles screen
  [:body
   {
    :width "100vw"
    :height "100vh"
    :font-family "sans-serif"
    :counter-reset "myCounter"
    :font-size (px 16)
    :line-height 1.5
     }]
   [:html
   {:width "100vw"
    :height "100vw"
    :background-color "black"
    :font-size (px 16)}]
  [:div
   {:background-color "white"
    :height (px 50)
    :color "white"}
   [:p { :color "black"}]]
  [(repeat 5 "x")])
