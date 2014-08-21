package com.danj.groovy_test.dsl

import groovy.transform.ToString;

@ToString
class ActionListDSL {

	def actions = [:]
	
	def methodMissing(String alias, args) {
		ActionDSL actionDSL = new ActionDSL()
		actionDSL.with args[0]
		actions.put(alias, actionDSL)
	}
	
}
