(ns site.sections.roadmap)

(def roadmap-features
  [["Done"
    ["link embed sections"
     "release website"]]

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

(def roadmap-section
  [:section#roadmap
   [:div.content
    [:h2 "Roadmap"]
    [:div.kanban
     (for [[p features] roadmap-features]
       [:div.phase {:data-phase p}
        [:h3 p]
        [:div.features
         (for [feature features]
           [:div.feature feature])]])]]])
