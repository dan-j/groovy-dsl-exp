package com.danj.groovy_test.dsl

class TestcaseDSL {
	
	String name
	def actions = [:]
	
	def parse(closure) {
		closure.delegate = this
		closure()
		
		return this
	}
	
	
	def methodMissing(String name, args) {
		this.name = name
		ActionListDSL actionListDSL = new ActionListDSL()
		actionListDSL.with args[0]
		this.actions = actionListDSL.actions
	}

}
