(defproject com.smxemail/lein-jnaerator "0.1.0-SNAPSHOT"
  :description "Super thin wrapper around JNAerator CLI, allowing Leiningen projects to use it in a managed way."
  :url "https://github.com/SMX-LTD/lein-jnaerator"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :eval-in-leiningen true
  :dependencies [[com.nativelibs4java/jnaerator "0.11"]]
  :lein-release {:deploy-via :clojars})

