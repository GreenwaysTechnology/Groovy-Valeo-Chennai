package com.valeo.ts.scripts.clos


def UserInput = {
	println "Enter Your Name";
	def name = it.next()
	println "Your Sweet name is $name";
}
UserInput(new Scanner(System.in))