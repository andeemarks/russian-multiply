(ns russian-multiply.core
  (:gen-class))

(defn repeat-add [numbers]
  (if (empty? numbers)
    0
    (reduce + numbers)))

(defn remove-when-corr-even [numbers corr-numbers]
  (let [zipper (map vector numbers corr-numbers)]
    (mapv first (filter #(odd? (second %)) zipper))))

(defn repeat-double [base count]
  (loop [number base
          doubles '[]
          index 0]
    (if (= index count)
      doubles
     (recur (* number 2) (conj doubles number) (inc index)))))

(defn repeat-halve [divisor]
    (loop [number divisor
            even-factors '[]]
      (if (< number 1)
        even-factors
       (recur (quot number 2) (conj even-factors number)))))

(defn multiply [n1 n2]
  0)

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
