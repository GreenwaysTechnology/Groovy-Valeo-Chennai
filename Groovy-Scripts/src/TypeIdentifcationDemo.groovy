
//Dynamic typing
 //Where variable intialized , according to value , the type of variable
//is changed
def foo=1;
println "foo is Byte " + (foo instanceof Byte)	
println "foo is Short " + (foo instanceof Short)
println "foo is Integer " + (foo instanceof Integer)
println "foo is Long " + (foo instanceof Long)

BigInteger i= 344324234234324234444444444444444444444442342412312321332131231231231321323313213123123213232132132132321321321312321335345435344636;
println i;

def j=344324234234324234444444444444444444444442342412312321332131231231231321323313213123123213232132132132321321321312321335345435344636;
println "J is Integer " + (j instanceof Integer)
println "J is BigInteger " + (j instanceof BigInteger)

def x =93393434343;
println "x is Integer " + (x instanceof Integer)
println "x is Long " + (x instanceof Long)
////////////////////////////////////////////////////////////////////////////////
def stockValue =10.5;
println "stockValue is Float " + (stockValue instanceof Float)
println "stockValue is Double " + (stockValue instanceof Double)
println "stockValue is BigDecimal " + (stockValue instanceof BigDecimal)
//////////////////////////////////////////////////////////////////////////////////
//How to override default type in dynamic programming
//Short a =100;
def a =100 as Short; // here 100 is converted into Short: Integer to Short conversion
println "a is Short " + (a instanceof Short)




