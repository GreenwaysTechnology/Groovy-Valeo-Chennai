package com.valeo.exc


try {
	//risky code
	def a =10;
	def b =  a / 0;
	println b
}catch(e) {
	println "Something went wrong"
}
finally {
	println "Program was over"
}