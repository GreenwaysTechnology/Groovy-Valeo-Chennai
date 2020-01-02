
println "Regular Expression-Groovy Implementation"

//Step 1: declare input string
def inputString ="hey  hello 0 1, how subramanian , 7m3";
//Step 2: declare string inside slashy String
//String regex = /\d+/;
//Step 3: declaration + Compile
//String regex = ~/\d+/;
//Step 4: declare slashy + Compile + Match  
def matcher =(inputString =~/\d+/)
while(matcher.find()) {
	println(matcher.group());
}