(ns site.styles.core
  (:require [garden.core :as garden]
            [garden.stylesheet :refer [at-import]]))

(def color-bg "#80a5c1")
(def image-height "70vh")
(def pad "3rem")

(defn fontawesome-mixin [unicode]
  {:content (str "\"" unicode "\"")
   :font-family "FontAwesome"})

(def button-mixin
  [:&
   {
    :border-radius "0.5rem"
    :padding "1.5rem 1.75rem"
    :font-size "1.5rem"
    :font-weight "bold"
    :cursor "pointer"
    :outline "none"
    :font-family "Lato"
    :text-decoration "none"
    :display "inline-block"

    :border "2px solid #FFF"
    :color "#659ECA"
    :background "rgba(255,255,255,1.0)"
    :transition "background 0.1s ease-in-out"}

   [:&:hover
    {:background "rgba(255,255,255,0.8)"}]

   [:&:active
    {:background "rgba(255,255,255,0.6)"}]])

(def header-section
  [:#header
   {:position "absolute"
    :width "100%"}

   [:.content
    {:position "relative"}

    [:a.logo
     {:display "inline-block"
      :text-decoration "none"
      :color "#FFF"}

     [:&:before
      {:content "\"\""
       :width "2rem"
       :height "2rem"
       :display "inline-block"
       :background "url(/images/braid-logo-bw.svg) no-repeat"
       :background-size "contain"
       :vertical-align "middle"
       :margin-right "0.5em"}]

     [:h1
      {:display "inline-block"
       :font-size "1.25em"
       :line-height "2rem"
       :vertical-align "middle"}]

     [:span
      {:display "inline-block"
       :opacity "0.7"
       :font-size "0.75em"
       :line-height "2rem"
       :vertical-align "sub"
       :margin-left "0.5em"
       :text-transform "uppercase"
       :letter-spacing "0.1em"}]]

    [:.menu
     {:display "inline-block"
      :position "absolute"
      :right 0}

     [:a
      {:color "#FFF"
       :opacity 0.7
       :text-decoration "none"
       :margin-left "2em"
       :transition "opacity 0.1s ease-in-out"
       :line-height "2em"}

      [:&:hover
       {:opacity 1}]

      [:&.github:before
       {:content "\"\uf092\""
        :font-family "FontAwesome"
        :margin-right "0.25em"}]]]]])

(def hero-section
  [:#hero
   {:background color-bg
    :background-image "url(/images/hero-bg.png)"
    :background-size "cover"
    :background-position "bottom center"
    :padding-top "10rem"
    :min-height "100vh"
    :box-sizing "border-box"
    :color "#FFF"}

   [:.content
    {:position "relative"
     :height image-height
     :display "flex"
     :flex-direction "column"
     :justify-content "center"}

    [:.story
     {:max-width "30em"}

     [:h1
      {:font-family "Montserrat"
       :font-size "2em"
       :text-shadow "0 0.05em 0.1em rgba(0,0,0,0.1)"}]

     [:h2
      {:font-size "1.5em"
       :margin "1rem 0 2rem"
       :text-shadow "0 0.05em 0.1em rgba(0,0,0,0.25)"}]

     [:.cta
      {:display "inline-block"
       :text-align "center"}

      [:.button
       button-mixin

       [:&:after
        (fontawesome-mixin \uf138)
        {:margin-left "0.5em"}]]

      [:a.microtext
       {:display "block"
        :font-size "0.8em"
        :margin-top "0.5rem"
        :color "#FFF"
        :opacity 0.7
        :text-decoration "none"
        :transition "color 0.1s ease-in-out"}

       [:&:hover
        {:opacity 1}]

       [:&:active
        {:opacity 1}]

       [:&:after
        (fontawesome-mixin \uf101)
        {:margin-left "0.25em"}]]]]

    [:.image
     {:height image-height
      :position "absolute"
      :left "40em"
      :top 0}]]])

(def roadmap-section
  [:#roadmap
   {:background color-bg}

   [:.content
    [:.kanban
     {:display "flex"
      :justify-content "space-between"}

     [:.phase
      {:background "#DFDFDF"
       :flex-basis "22%"
       :padding "0.5em"
       :border-radius "0.25em"}

      [:.feature
       {:background "white"
        :margin "0.5em 0"
        :padding "0.5em"
        :border-radius "0.25em"
        :position "relative"}]

      ["&[data-phase=Done]"
       [:.feature
        {:padding-right "1em"}

        [:&:after
         {:content "\"\uf058\""
          :font-family "FontAwesome"
          :position "absolute"
          :right "0.5em"
          :top "0.5em"
          :color "green"
          :font-size "1.1em"}]]]]]]])

(def body
  (garden/css
    (at-import "/css/reset.css")
    (at-import "//maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css")
    (at-import "//fonts.googleapis.com/css?family=Montserrat:700|Lato")

    [:body
     {:font-family "Lato"
      :line-height "1.25" }]

    [:section
     {:padding [[pad 0]]
      :overflow "hidden"}

     [:.content
      {:max-width "1000px"
       :margin [[0 "auto"]]}]]

    header-section
    hero-section
    roadmap-section))
