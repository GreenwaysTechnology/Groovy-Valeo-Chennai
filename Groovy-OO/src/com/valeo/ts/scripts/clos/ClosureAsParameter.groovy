package com.valeo.ts.scripts.clos


////////////////////////////////////////////////////////////////////
//a = x;
def add = {a-> a.plus 10 }

add(10)
def x =10;
println add(x);

//hai  = hi
def Greeter = { hai ->
	 hai();
}

def hi = {
	println "Hello";
}

//Syntax: declare closure separtely, pass to another closure
Greeter(hi);
//Syntax: declare Closure, pass directly

Greeter({
	println "Hello-2"
});
////////////////////////////////////////////////////////////////////////////////////

def server = {connect->
	def result = connect('Jira Server -Service Desk');
	println result;
};

//
//def JiraServer =  { name->
//	//return this message, where you are calling this Closure 
//	"$name is up and Running!"
//}
def JiraServer =  {
	//return this message, where you are calling this Closure
	"$it is up and Running!"
}
//Syntax 1:
server(JiraServer);

//syntax 2:
server({"$it is Up and Running"})





















