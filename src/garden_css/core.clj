(ns garden-css.core
  (:require [garden.def :refer [defstylesheet defstyles]]
            [garden.units :refer [px]]
            [garden.arithmetic :refer [+ - * /]]
            [garden.selectors]
            [garden.color :as color :refer [hsl rgb]]
            [garden.stylesheet :refer [at-media]]
            [mesh.grid :as grid]))


;; Change defstylesheet to defstyles.
(defstyles screen
  ;; I love these grids
  (grid/create-minimal-grid ".grid" (px 20))
  [:body {
    :width "100vw"
    :height "100vh"
    :font-family "sans-serif"
    :counter-reset "myCounter"
    :font-size (px 16)
    :line-height 1.5
     }
   [:html
   {:width "100vw"
    :height "100vw"
    :background-color "black"
    :font-size (px 16)}]]
  [:.myMain
   {:background-color "black"
    :color "white"}
   [:input:checked {:counter-increment "myCounter"}]]
   [:.count {:background-color "green"}]
   [:.count["&::after"
           {:content "counter(myCounter);"}]])
