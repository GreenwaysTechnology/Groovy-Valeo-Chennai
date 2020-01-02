
//Relational operators
def a =10;
def b =10;
println a == b;
println a < b;
println a <= b;
println a > b;
println a >=b;
println a!=b;

//Logical operators
def isActive = true;
def isEnabled = true;
println " && => " + isActive && isEnabled; //true
println " || => " + isActive || isEnabled; //true
println " !  => " +  !isEnabled; //false

//
def name =""  //false
def city ="Chennai";  //true
println name && city;//?


def start =0; //0 false
def stop= 10; //10 true
println start || stop; // true

def isEmpty; //null : fALSE
println !isEmpty; //!FALSE =>TRUE


//Elvis operator is used to assign default values if a variable is false.

def counter; //null
//if counter is false,then initalize 1 else the value of the counter
println counter ?: 1;

