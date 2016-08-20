(ns russian-multiply.core
  (:gen-class))

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
