(ns site.pages.index
  (:require [hiccup.core :as hiccup]
            [site.styles.core :as styles]))

(def roadmap-features
  [["Done"
    ["release web client"]]

   ["In Progress"
    ["polish user experience"
     "mobile clients"
     "improve developer experience"
     "integrations API"
     "email digests"]]

   ["Upcoming"
    ["keyboard shortcuts"
     "integrations"
     "reactions"]]

   ["Future"
    ["encryption"
     "federation"
     "voice, video and screensharing"]]])

(def html
  (hiccup/html
    [:html
     [:head
      [:title "Braid - Work Better Together"]
      [:style styles/body]]
     [:script
      ;"setInterval(function() { location.reload(); }, 500);"
      ]
     [:body
      [:section#header
       [:div.content
        [:a.logo {:href "#"}
         [:span "Braid"]]
        [:div.menu
         [:a.get-involved {:href "#"} "About"]
         [:a.integrations {:href "#"} "Docs"]
         [:a.get-involved {:href "#"} "Contribute"]
         [:a.github {:href "#"} "Github"]]]]

      [:section#hero
       [:div.content
        [:div.story
         [:h1 "Help us create a new way for groups to work together"]
         [:h2
          "Braid is an open-source group messaging platform "
          "that goes beyond chatrooms to help teams work better together"]
         [:div.cta
          [:button.mac "Contribute"]
          [:div.microtext "TODO"]]]
        [:img.image {:src "https://hipchat-magnolia-cdn.atlassian.com/dam/jcr:b56f34a3-b03a-45a7-a9dd-f5ae2e519bcd/hipchat-overview-hero.png?cdnVersion=4"}]]]]]


    ; Want us to host it for you?

    ; groups - be it companies, teams, families - are a central part of our lives. beyond ourselves. together, get more done.

    ; key to effective groups is communication

    ; communication used to be open - ... email -
    ; so much more potential
    ; we can do better, i hope you can join us

    [:section#goals
     [:div.content
      [:h2 "Goals"]

      [:div
       [:h3 "free group chat from closed-gardens"]
       [:p "freedom"]
       [:p "open source"]
       [:p "open platform group communication"]
       [:p "tear down the closed-gardens of"]]

      [:div
       [:h3 "go beyond the chatroom"]
       [:p "chatrooms haven't changed; suck"]
       [:p "flow"]
       [:p "context"]

       [:p "conversations"]
       [:p "awesome integrations"]]

      [:div
       [:h3 "spread the joy of clojure(script)"]

       [:p "showcase of clojure(script)"]
       [:p "rally cljs community"]
       [:p "grow cljs community"]]]]



    ; WHAT

    ; image + video

    ; go to https://www.braidchat.com/product for a full tour of the product
    ; go to try.braidchat.com for a demo

    [:section#roadmap
     [:div.content
      [:h2 "Roadmap"]
      [:div.kanban
       (for [[p features] roadmap-features]
         [:div.phase {:data-phase p}
          [:h3 p]
          [:div.features
           (for [feature features]
             [:div.feature feature])]])]]]

    [:section#contribute
     [:div.content
      [:h2 "Contribute"]
      [:div
       [:h3 "Code"]
       "easy features"
       "integrations"
       "core" ]
      [:div
       [:h3 "Give Feedback"]
       "test"
       "file bugs"
       "contribute feature ideas"
       "vote on features" ]

      [:div
       [:h3 "Write"]
       "dev docs"
       "user docs"
       "translate"
       ]

      [:div
       [:h3 "Share"]]

      [:div
       [:h3 "Sponsor"]
       "sign up for a premium group at braidchat.com"
       "bounty source"
       "gratipay"]

      [:button "Join Braid Chat"]]]))









