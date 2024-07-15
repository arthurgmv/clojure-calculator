(ns calculator)
(defn add [a b]
  (+ a b))

(defn subtract [a b]
  (- a b))

(defn multiply [a b]
  (* a b))

(defn divide [a b]
  (if (not= b 0)
    (/ a b)
    "Cannot divide by zero"))

(defn main []
  (println "Welcome to the simple calculator!")
  (println "Choose an operation: add, subtract, multiply, divide")
  (let [operation (read-line)
        _ (println "Enter the first number:")
        a (Double/parseDouble (read-line))
        _ (println "Enter the second number:")
        b (Double/parseDouble (read-line))
        result (case operation
                 "add" (add a b)
                 "subtract" (subtract a b)
                 "multiply" (multiply a b)
                 "divide" (divide a b)
                 "Invalid operation")]
    (println "Result:" result)))
(main)