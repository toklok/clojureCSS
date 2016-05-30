(defproject garden-css "0.1.0-SNAPSHOT"
  :plugins [[lein-garden "0.2.8"]]
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                          [garden "1.3.2"]
                          [me.raynes/fs "1.4.6"]
                          [facjure/mesh "0.4.0"]
                          [ns-tracker "0.3.0"]]
  :main ^:skip-aot garden-css.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}}
  :garden {:builds [{;; Optional name of the build:
                     :id "screen"
                     ;; Source paths where the stylesheet source code is
                     :source-paths ["src"]
                     ;; The var containing your stylesheet:
                     :stylesheet garden-css.core/screen
                     ;; Compiler flags passed to `garden.core/css`:
                     :compiler {;; Where to save the file:
                                :output-to "resources/screen.css"
                                ;; Compress the output?
                                :pretty-print? false}}]})
