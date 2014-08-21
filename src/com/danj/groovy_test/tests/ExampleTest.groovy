package com.danj.groovy_test.tests

class ExampleTest {

	def testcase = {
		"exampleTest" {
			"step1" {
				action "setup"
				param1 "value1"
			}
			"step2" {
				action "doSomething"
				arg1 "arg1"
				arg2 "arg2"
			}
			"step3" {
				action "teardown"
				paramN "nthParam"
			}
		}
	}
}