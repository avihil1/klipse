(ns klipse.run.plugin-prod.plugin
  (:require klipse.core
            klipse.js-eval
            klipse.js-compile
            klipse.ruby
            klipse.scheme
            klipse.php
            klipse.server-eval
            klipse.markdown
            klipse.lambdaway
            klipse.html
            [klipse.plugin :as plugin]))

(print "settings: " (aget js/window "klipse_settings"))
(defn ^:export settings []
  (aget js/window "klipse_settings"))

(plugin/init (settings))
