(ns russian-multiply.core-test
  (:require [clojure.test :refer :all]
            [russian-multiply.core :refer :all]))

(deftest russion-multiplication
  (testing "multiply"
    (is (= [10 20 40 80 160] (multiply 10 5)))
    (is (= [10] (multiply 10 1))))

  (testing "divide"
    (is (= [123 61 30 15 7 3 1] (divide 123)))
    (is (= [2 1] (divide 2)))
    (is (= [1] (divide 1)))))
