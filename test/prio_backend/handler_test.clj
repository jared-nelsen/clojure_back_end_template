(ns prio-backend.handler-test
  (:require [clojure.test :refer :all]
            [ring.mock.request :as mock]
            [prio-backend.handler :refer :all]))

(deftest test-app
  (testing "main route"
    (is (= 1 1))))
