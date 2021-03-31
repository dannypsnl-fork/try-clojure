(ns try-clojure.core)

(defn id "I return what I get"
  [x] x)

(defn multi-add
  ([a b c] (+ a b c))
  ([a b] (+ a b))
  ([a] a))

(def fib "fibonacci number"
  (memoize
   (fn [n]
     (condp = n
       0 1
       1 1
       (+ (fib (- n 1))
          (fib (- n 2)))))))
