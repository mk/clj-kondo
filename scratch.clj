(ns scratch
  (:require [clj-kondo.core :as kondo]))

(:analysis (with-in-str "'(fn [x] [:span.cmt-atom.inspected-value (str x)])"
             (kondo/run! {:lint ["-"]
                          :config {:analysis {:locals true}}})))

(:analysis (with-in-str "(inc '(fn [x] [:span.cmt-atom.inspected-value (str x)]))"
             (kondo/run! {:lint ["-"]
                          :config {:analysis {:locals true}}})))

(:analysis (with-in-str "'nextjournal.clerk.render/render-code"
             (kondo/run! {:lint ["-"]
                          :config {:analysis true}})))


