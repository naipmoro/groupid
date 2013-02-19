(defproject {{long-name}} "0.1.0-SNAPSHOT"
  :description "description of the project"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"} 
  :dependencies [[org.clojure/clojure "1.4.0"]]
  :profiles {:1.3 {:dependencies [[org.clojure/clojure "1.3.0"]]}
             :1.5 {:repositories [["sonatype-snapshots" "https://oss.sonatype.org/content/repositories/snapshots/"]]
                   :dependencies [[org.clojure/clojure "1.5.0-master-SNAPSHOT"]]}})
