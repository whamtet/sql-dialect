(ns sql-dialect.core)

(def columns (atom #{}))

(defmacro sql-statement [s]
  (reduce (fn [s [full replacement]]
            (swap! columns conj replacement)
            (.replace s full replacement))
          s (re-seq #"(w+)\*" s)))

(defn create-indices! []
  ;; TODO
  )
