(ns try-clojure.core)

(defn id "I return what I get"
  [x] x)

(defn multi-add
  ([a b c] (+ a b c))
  ([a b] (+ a b))
  ([a] a))
