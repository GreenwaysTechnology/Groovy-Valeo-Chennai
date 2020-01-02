

//def sayHello(def name) {
//  println "Hello Mr/Mrs $name";
//}
def sayHello(String name='default Value') {
	println "Hello Mr/Mrs ${name.toUpperCase()}";
}
sayHello("Subramanian")
//sayHello(1);
sayHello()//null

//def add(int a=0,int b=0) {
//	println "Result is ${a.plus b}"
//
//}
def add(a=0,b=0) {
	println "Result is ${a.plus b}"

}
add(10,10)
add()
////////////////////////////////////////////////////////////////////////////////

String getCity() {
	return 'Chennai';
}
println getCity();

int multiply() {
	return 10 * 10;
}
println multiply();

def divide() {
	return 10/2;
}
println divide();

/////////////////////////////////////////////////////////////////////////////

//NOte : in groovy return statment not necessary, because by default every method returns
//value

def getStockValue() {
	100.90 // return 100.90
}
println getStockValue()


def getProductInfo(qty=10,price=100) {
	def quantity = qty;
	def productprice =price
	def total = quantity.multiply productprice ; //return total
}
println "Prodcut Details ${getProductInfo(104,100)}";

//Task: write login method which receives user name and password, default user name is admin ,password
//admin, if username and password is admin and admin , print login success,else login
//failed

def login(userName="admin" , password="admin") {
	userName.equals("admin") && password.equals("admin")
}
def status = login("guest",'guest')? "Success" : "Failed"
println status;
////////////////////////////////////////////////////////////////////////////////////

//i want method to take n- number of parameters but i dont in advance how
//many parameters i pass : Var...Args
def logger(def ...message) {
	message;
}
println logger('Warn')
println logger()
println logger('Warn','SLF','ServiceDesk','SmartOffice')
////////////////////////////////////////////////////////////////////////////////////
//Positional Parameters : parameters can be passed to function based on position

def save(String fileName,int size,String author) {
	"$fileName $size $author"
}
println save("customer.txt",10,"Ram")
//changining position will throw error
//println save(3,"test","Ram")
