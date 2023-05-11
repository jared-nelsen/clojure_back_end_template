(ns my-project.handler-test
  (:require [clojure.test :refer :all]
            [ring.mock.request :as mock]
            [priora-backend.core :refer :all]))

(deftest test-app
  (testing "main route"
    (is (= 1 1))))
