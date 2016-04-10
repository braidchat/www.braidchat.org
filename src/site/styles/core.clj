(ns site.styles.core
  (:require [garden.core :as garden]
            [garden.stylesheet :refer [at-import]]))


(def color-link-normal "#87A3F0")
(def color-link-hover "#476BCD")

(def image-height "300px")

(def pad "3rem")

(def body
  (garden/css
    (at-import "/css/reset.css")
    (at-import "//maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css")
    (at-import "//fonts.googleapis.com/css?family=Montserrat:700|Lato")
    [:body
     {:font-family "Lato"
      :line-height "1.25"}]

    [:section
     {:padding [[pad 0]]}
     [:.content
      {:max-width "800px"
       :margin [[0 "auto"]]}]]

    [:a
     {:color color-link-normal}

     [:&:hover
      {:color color-link-hover}]]

    [:#header
     {:background "skyblue"
      }

     [:.content
      {:position "relative"}

      [:.logo
       {:display "inline-block"
        :text-decoration "none"}]

      [:.menu
       {:position "absolute"
        :right 0
        :top 0}

       [:a
        {:margin-left "2em"
         :text-decoration "none"}

        [:&.github:before
         {:content "\"\uf092\""
          :font-family "FontAwesome"
          :margin-right "0.25em"}]]]]]

    [:#hero
     {:background "skyblue"
      :padding-top 0}

     [:.content
      {:position "relative"
       :height image-height
       :display "flex"
       :flex-direction "column"
       :justify-content "center"}

      [:.story
       {:max-width "25em"
        :display "inline-block"}

       [:h1
        {:font-family "Montserrat"
         :font-size "1.75em"}]

       [:h2
        {:font-size "1.25em"}]]

      [:.image
       {:height image-height
        :position "absolute"
        :left "30em"
        :top 0}]]]



    [:#roadmap
     {:background "skyblue"}

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
            :font-size "1.1em"}]]]]]]]))
