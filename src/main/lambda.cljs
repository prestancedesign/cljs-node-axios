(ns main.lambda
  (:require ["axios" :as axios]))

(defn handler []
  (->
    (.get axios "http://webcode.me")
    (.then (fn [resp] (.log js/console (.-data resp))))))

(handler)
