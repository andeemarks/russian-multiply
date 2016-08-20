(ns russian-multiply.core-test
  (:require [clojure.test :refer :all]
            [russian-multiply.core :refer :all]))

(deftest a-test
  (testing "divide"
    (is (= [123 61 30 15 7 3 1] (divide 123)))
    (is (= [2 1] (divide 2)))
    (is (= [1] (divide 1)))))
