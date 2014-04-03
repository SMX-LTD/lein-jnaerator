(ns leiningen.jnaerator
  (:import com.ochafik.lang.jnaerator.JNAerator))

(defn jnaerator
  "JNAerator task. Invoke with: lein jnaerator run args..."
  [project & args]
  (if (= "run" (first args))
    (JNAerator/main (into-array String (rest args)))
    (println "JNAerator task. Invoke with: lein jnaerator run args...")))
