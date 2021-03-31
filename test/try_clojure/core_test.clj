(ns try-clojure.core-test
  (:require [clojure.test :refer :all]
            [try-clojure.core :refer :all]))

(deftest id-test
  (testing "id returns what it get"
    (is (= (id 0) 0))))
