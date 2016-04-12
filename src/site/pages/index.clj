(ns site.pages.index
  (:require [hiccup.core :as hiccup]
            [site.styles.core :as styles]
            [site.sections.roadmap :refer [roadmap-section]]
            [site.sections.contribute :refer [contribute-section]]
            [site.sections.goals :refer [goals-section]]))

(def html
  (hiccup/html
    [:html
     [:head
      [:title "Braid - Work Better Together"]
      [:style styles/body]]
     [:body
      [:section#header
       [:div.content
        [:a.logo {:href "/"}
         [:h1 "Braid"]
         [:span "Open Source"]]
        [:div.menu
         [:a.get-involved {:href "/about"} "About"]
         [:a.integrations {:href "/docs"} "Docs"]
         [:a.get-involved {:href "/contribute"} "Contribute"]
         [:a.github {:href "https://github.com/braidchat/braid"} "Github"]]]]

      [:section#hero
       [:div.content
        [:div.story
         [:h1 "Help us create a new way for groups to work together"]
         [:h2
          "Braid is an open-source group messaging platform "
          "that goes beyond chatrooms to help teams work better together"]
         [:div.cta
          [:a.button {:href "#"}
           "Get Started"]
          [:a.microtext {:href "#"}
           "Or, learn more about Braid"]]]
        [:img.image {:src "/images/braid-screenshot-archer.png"}]]]]]

    ; roadmap-section
    ; contribute-section
    ; goals-section
    ))


; Want us to host it for you?

; groups - be it companies, teams, families - are a central part of our lives. beyond ourselves. together, get more done.

; key to effective groups is communication

; communication used to be open - ... email -
; so much more potential
; we can do better, i hope you can join us




; WHAT

; image + video

; go to https://www.braidchat.com/product for a full tour of the product
; go to try.braidchat.com for a demo









