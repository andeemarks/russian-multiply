(ns russian-multiply.core-test
  (:require [clojure.test :refer :all]
            [russian-multiply.core :refer :all]))

(deftest russion-multiplication
  (testing "repeat-double"
    (is (= [10 20 40 80 160] (repeat-double 10 5)))
    (is (= [10] (repeat-double 10 1))))

  (testing "repeat-halve"
    (is (= [123 61 30 15 7 3 1] (repeat-halve 123)))
    (is (= [2 1] (repeat-halve 2)))
    (is (= [1] (repeat-halve 1)))))
