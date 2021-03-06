(defproject cryogen-core "0.1.4"
            :description "Cryogen's compiler"
            :url "https://github.com/lacarmen/cryogen-core"
            :license {:name "Eclipse Public License"
                      :url  "http://www.eclipse.org/legal/epl-v10.html"}
            :dependencies [[org.clojure/clojure "1.6.0"]
                           [clj-rss "0.1.9"]
                           [me.raynes/fs "1.4.6"]
                           [crouton "0.1.2"]
                           [cheshire "5.4.0"]
                           [clj-text-decoration "0.0.3"]
                           [io.aviso/pretty "0.1.13"]
                           [hiccup "1.0.5"]
                           [selmer "0.7.7"]
                           [markdown-clj "0.9.58"
                            :exclusions [com.keminglabs/cljx]]])
