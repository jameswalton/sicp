(ns sicp.core)

(defn average
  [x y]
  (/ (+ x y) 2.0))

(defn improve
  [guess x]
  (average guess (/ x guess)))

(defn good-enough?
  [guess x]
  (<= (Math/abs (- (* guess guess) x)) 0.0001))

(defn sqrt-iter
  [guess x i]
  (if (good-enough? guess x)
    [guess i] 
    (recur (improve guess x) x (inc i))))

(defn sqrt
  [x]
  (sqrt-iter 1.0 x 1))

(sqrt 13)
