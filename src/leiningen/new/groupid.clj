(ns leiningen.new.groupid
  (:use [leiningen.new.templates :only [->files name-to-path sanitize-ns renderer]]))

(def render (renderer "groupid"))

;; main template entry point
(defn groupid
  [^String long-name]
  (if-not (.contains long-name "/")
    (println "The project name must contain a group-id prefix")
    (let [split-name (clojure.string/split long-name #"/")
          data {:name            (last split-name)
                :long-name        long-name
                :fs-path         (name-to-path long-name)
                :sanitized-ns    (sanitize-ns long-name)}]
      (println "Generating a new project named " long-name)
      (->files data
               [".gitignore"                       (render "gitignore" data)]
               ["CHANGELOG.md"                     (render "CHANGELOG.md" data)]
               ["LICENSE"                          (render "LICENSE" data)]
               ["README.md"                        (render "README.md" data)]
               ["project.clj"                      (render "project.clj" data)]
               ["src/{{fs-path}}/core.clj"         (render "core.clj" data)]
               ["test/{{fs-path}}/core_test.clj"   (render "test.clj" data)]))))
