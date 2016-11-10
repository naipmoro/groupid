(defproject groupid/lein-template "0.2.1"
  :description "A leiningen template for new projects containing a group-id prefix"
  :url "https://github.com/naipmoro/groupid"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo}
  :scm {:name "git"
        :url "https://github.com/naipmoro/groupid"}
  :deploy-repositories [["releases" :clojars]]
  :eval-in-leiningen true)
