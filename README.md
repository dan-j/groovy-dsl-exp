Groovy experiments
==================

Playing around with Groovy to write tests in a DSL and parse it into a structure that can be printed

The DSL is defined in ExampleTest but is the following:
```
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
```

Running the main method on this closure prints the following:

```
Testcase name: exampleTest
Step: step1, Action: setup Params: [param1:value1]
Step: step2, Action: doSomething Params: [arg1:arg1, arg2:arg2]
Step: step3, Action: teardown Params: [paramN:nthParam]
```
