(ns spike-floobits.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn add-one [x]
  (+ 1 x))

(defn add-two [x]
  (+ 2 x))

(comment
  (add-one 3)

  (map add-two (range 10))  ;;=> (2 3 4 5 6 7 8 9 10 11)
  (map add-one [1 2 3 4 5]) ;;=> (2 3 4 5 6)

  nil)

;; NOTE: from Emacs try M-x floobits-clear-highlights
nil
