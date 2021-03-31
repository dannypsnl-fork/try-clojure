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
