package com.valeo.ts.scripts.clos

println "Returning Closure from another";

def add = {10+10}

def r= add();  //=>20

//returning Closure

def greeter= {

	//Returning Closure
	return {
		println "Greeter";
	};
}

def result= greeter()//
result();

//Short cut to the above code ()-calls first closure ()-calls returned closure
greeter()()

//without return statement


def  hello = {

	def mycls={
		println "Hello"
	};
}

def h=hello();
h();
////////////////////////////////////////////////////////////////////////////////////

//Nested Closures

def suit = { name,age->
	
	println "Outter closure"
	println "$name $age"
	
	return { state,city->
		
		println "inner closure"
		println "$state $city"
		
		return { location,isActive->
			
			println "inner most closure"
			println "$location,$isActive"
			
			return {
				println " inner the most closure"
				println "$it"
			}
		}
	}

}
suit('Subramanian',18)('TN','CBE')('Chennai',true)('Good Bye')





















