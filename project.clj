(defproject clj-telnet "0.5.0"
  :description "A clojure telnet client"
  :url "https://github.com/komcrad/clj-telnet"
  :license {:name "LGPL-3.0"
            :url "https://www.gnu.org/licenses/lgpl-3.0.en.html"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [commons-net/commons-net "3.5"]]
  :deploy-repositories [["releases" {:url "https://mvn.redlion.net/repository/maven-releases"
                                     :sign-releases false}]
                        ["snapshots" {:url "https://mvn.redlion.net/repository/maven-snapshots"
                                      :sign-releases false}]])
