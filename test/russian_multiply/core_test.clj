(ns russian-multiply.core-test
  (:require [clojure.test :refer :all]
            [russian-multiply.core :refer :all]))

(deftest russion-multiplication
  (testing "repeat-double"
    (is (= [10 20 40 80 160] (repeat-double 10 5)))
    (is (= [10] (repeat-double 10 1))))

  (testing "remove-evens"
    (is (= [] (remove-evens [])))
    (is (= [1 3 5 7 9] (remove-evens [1 2 3 4 5 6 7 8 9 10])))
    (is (= [] (remove-evens [2]))))

  (testing "repeat-halve"
    (is (= [123 61 30 15 7 3 1] (repeat-halve 123)))
    (is (= [2 1] (repeat-halve 2)))
    (is (= [1] (repeat-halve 1)))))
