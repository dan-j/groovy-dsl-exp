package com.danj.groovy_test.dsl

import groovy.transform.ToString;

@ToString
class TestcaseDSL {
	
	String name
	def actions = [:]
	
	def methodMissing(String name, args) {
		this.name = name
		ActionListDSL actionListDSL = new ActionListDSL()
		actionListDSL.with args[0]
		this.actions = actionListDSL.actions
	}

}
