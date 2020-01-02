package com.valeo.ts.scripts.clos;


//Closure declaration: closure is just method,stored inside variable

def hello = {
	//logic
	println "Hello Closure"
}

hello();

//Clsoure with args

def sayHello = {def name='Valeo' -> println "name is $name" };

//we
sayHello('Subramanian')
sayHello()

//closure with two parameters ,multi line code
def add = {a=0,b=0 -> 
	def result =  a + b;
	println "The Result is $result"
	
}
add(10,10)

//return value in closures

def multiply = {a=10,b=10 -> 
	a*b;
};
println multiply()
//no arg ,only body
//def greet = {-> println "Greet"};
//no need of ->
def greet = {println "Greet"};
greet();
//////////////////////////////////////////////////////////////////////////////////

//Single parameter : code simplification

//def getStockValue = {value -> println "Stock Value $value"}
//we need not use Parameter , rather than Groovy provides in built variable it

//def getStockValue = {println "Stock Value $it"}
//return value
//def getStockValue = {it}
def getStockValue = {"StockValue $it"}
println getStockValue(100)

//Typed parameter
def isOdd = { int i -> i%2 != 0 }
println isOdd(10) ? "Odd Number" : "Even Number"
//Groovy Style : using it
//
def isEven = {it%2==0}
println isEven(10) ? "Even Number" : "Not Even Number"



