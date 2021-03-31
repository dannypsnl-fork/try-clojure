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
    (is (= (fib 0) 1))
    (is (= (fib 1) 1))
    (is (= (fib 2) 2))
    (is (= (fib 3) 3))
    (is (= (fib 4) 5))
    (is (= (fib 5) 8))))
