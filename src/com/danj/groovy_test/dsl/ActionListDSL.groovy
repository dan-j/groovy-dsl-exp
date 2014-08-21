package com.danj.groovy_test.dsl

class ActionListDSL {

	def actions = [:]
	
	def parse(closure) {
		closure.delegate = this
		closure()
		
		return actions
	}

	def methodMissing(String alias, args) {
		ActionDSL actionDSL = new ActionDSL()
		actionDSL.with args[0]
		actions.put(alias, actionDSL)
	}
	
}
