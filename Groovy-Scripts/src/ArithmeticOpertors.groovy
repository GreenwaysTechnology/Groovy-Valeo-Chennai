

def a = 10;
def b = 20;
def addResult = a  + b; //imperative style
//def addResult1 = a.plus(b); // declarative groovy style : dsl
def addRes = a.plus b
def minRes = a.minus b
def mulRes = a.multiply b;
def divRes = a.div b;
def powerResult  =  a ** b;
def powerRes = a.power b;
println "Add Result is $addResult"
println "Add Result is $addRes"
println "minRes Result is $minRes"
println "mul Result is $mulRes"
println "divRes Result is $divRes"
println "divRes Result is $divRes"
println "powerResult Result is $powerResult $powerRes"
