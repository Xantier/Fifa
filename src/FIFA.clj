(ns FIFA
  (:gen-class))

(def players (list 'Jussi, 'Ian, 'Enrico, 'Devoy))
(def teams (list 'Senators, 'Bruins, 'Avalanche, 'Hurricanes))

(defn getpairs [plrs]
  (partition 2 (shuffle plrs)))

(println (reduce (fn [_ [t p]]
                   (println
                     (format "Team: %s -> Players: %s" t
                             (clojure.string/join ", " p)
                             )
                     )
                   )
                 nil
                 (map vector teams
                      (getpairs players)
                      )))