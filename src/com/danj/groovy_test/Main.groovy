package com.danj.groovy_test;

import com.danj.groovy_test.dsl.TestcaseDSL

class Main {
	
	static void main(args) {
		String testName = "com.danj.groovy_test.tests.ExampleTest"
		
		def test = Class.forName(testName).newInstance()
		TestcaseDSL dsl = new TestcaseDSL()
		dsl.with test.testcase
						
		println "Testcase name: " + dsl.name

		dsl.actions.each { alias, step ->
			println "Step: " + alias + ", Action: " + step.action + " Params: " + step.params
		}
	}
}
