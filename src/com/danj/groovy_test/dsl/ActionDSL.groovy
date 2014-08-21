package com.danj.groovy_test.dsl

import groovy.transform.ToString;

@ToString
class ActionDSL {
	
	String action
	def params = [:]
	
	def action(String action) {
		this.action = action
	}
	
	def methodMissing(String paramName, values) {
		this.params.put(paramName, values[0])
	}

}
