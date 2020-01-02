

//String Declaration
//Double quotes
def str = "Hello";
println "Str is String " + (str instanceof java.lang.String);
println "Str is GString " + (str instanceof groovy.lang.GString);

//Single Quotes
def state = 'Tamil Nadu';
println state;
println "state is String " + (state instanceof java.lang.String);

//To declare Character type : by default which is String
def gender = 'M' as Character;
println "Gender is String " + (gender instanceof java.lang.String);

//multiline in java
def doc="<html>" +
        "<body>" + 
		 "<h1>Hello</h1>"
		 "</body>" 
		 "</html>";
println doc;

//Groovy style
def gDoc ='''
    <html>
<head>
<title>
  Welcome
</title>
<body>
 <h1>Welcome</h1>
</body>
''';
println gDoc

def name = "Subramanian";
def subject = "Groovy";
//String concatnation in java
def message = name + " is teaching " + subject;
//Groovy : String Interploation 
//def newMessage = "${name} is teaching ${subject}";
def newMessage = "$name is teaching $subject";
println message;
println newMessage;
println "New Message is GString " + (newMessage instanceof GString)


//Multi line with String interploation :  """

def title='Valeo Innovation Center'
def heading= 'Welcome to Valeo Innovation Center';
def multilineStrinter ="""
    <html>
<head>
<title>
    $title
</title>
<body>
 <h1>$heading</h1>
</body>
""";
println multilineStrinter;

//Slashy Strings

//Java Style : \ escape characters
def quote = " Hello ! how are you? \" i am fine what about you";
println quote;
        
def path = "c:\\groovy\\training\\demos ";
println path;
//Groovy Style : using slashy String

// slashy syntax : /your string/
def newQuote = / Hello ! how are you? \" i am fine what about you/;
println newQuote;

def mynewPath =/ c:groovy\training\demo\ /;
println mynewPath;

//multi line + special characters + interploation : $//$ : dollar slashy strings
def multiDollar= $/
 Hello $name !
 how are you?
 \" i am fine 
what about you
/$;
println multiDollar


