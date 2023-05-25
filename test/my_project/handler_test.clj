(ns my-project.handler-test
  (:require [clojure.test :refer :all]
            [ring.mock.request :as mock]
            [my-project.core :refer :all]))

(deftest test-app
  (testing "main route"
    (is (= 1 1))))
