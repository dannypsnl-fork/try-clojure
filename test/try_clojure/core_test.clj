(ns try-clojure.core-test
  (:require [clojure.test :refer :all]
            [try-clojure.core :refer :all]))

(deftest id-test
  (testing "id returns what it get"
    (is (= (id 0) 0))))

(deftest multi-add-test
  (testing "multi-add"
    (is (= (multi-add 1 2 3) 6))
    (is (= (multi-add 1 2) 3))
    (is (= (multi-add 1) 1))))

(deftest reg-replace-test
  (testing "reg replace"
    (is (= (clojure.string/replace "left-eye" #"^left-" "right-")
           "right-eye"))))

(deftest fib-test
  (testing "fib"
    (is (= 1 (fib 0)))
    (is (= 1 (fib 1)))
    (is (= 2 (fib 2)))
    (is (= 3 (fib 3)))
    (is (= 5 (fib 4)))
    (is (= 8 (fib 5)))
    (is (= 1346269 (fib 30)))))
