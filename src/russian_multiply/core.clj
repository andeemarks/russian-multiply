(ns russian-multiply.core
  (:gen-class))

(defn multiply [base count]
  (loop [product base
          multiples '[]
          index 0]
    (if (= index count)
      multiples
     (recur (* product 2) (conj multiples product) (inc index)))))

(defn divide [divisor]
    (loop [factor divisor
            even-factors '[]]
      (if (< factor 1)
        even-factors
       (recur (quot factor 2) (conj even-factors factor)))))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
