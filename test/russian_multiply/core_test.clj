(ns russian-multiply.core-test
  (:require [clojure.test :refer :all]
            [russian-multiply.core :refer :all]))

(deftest russion-multiplication
  (testing "multiply"
    (is (= 0 (multiply 0 0)))
    (is (= 14160 (multiply 24 590)))
    (is (= 14160 (multiply 590 24)))
    (is (= 1 (multiply 1 1))))

  (testing "repeat-double"
    (is (= [10 20 40 80 160] (repeat-double 10 5)))
    (is (= [10] (repeat-double 10 1))))

  (testing "repeat-add"
    (is (= 0 (repeat-add [])))
    (is (= 25 (repeat-add [5 10 7 3])))
    (is (= 3 (repeat-add [3]))))

  (testing "remove-when-corr-even"
    (is (= [] (remove-when-corr-even [] [])))
    (is (= [2 4] (remove-when-corr-even [1 2 3 4 5] [6 7 8 9 10])))
    (is (= [] (remove-when-corr-even [2] [0]))))

  (testing "repeat-halve"
    (is (= [123 61 30 15 7 3 1] (repeat-halve 123)))
    (is (= [2 1] (repeat-halve 2)))
    (is (= [1] (repeat-halve 1)))))
