

def name ="Subramanain";
def age =18;

//simple method
//java pattern
public void sayHello() {
	System.out.println("Hello method")
}
sayHello();

//Groovy style
def sayHai() {
	println "Hai";
}
sayHai();
////////////////////////////////////////////////////////////////////////////////

def getFieldById(id) {
	return "CustomerTextBox $id";
}

def  getISBSFormFileds() {
	def customerTextBox=getFieldById("00111");
	def newTextbox = "0002"
	loadOrders(customerTextBox,newTextBox);
}
def showOrderField() {
	println "Order fields are enabled"
}
def hidOrderField() {
	println "Order fields are disabled"
}
def loadOrders(customerTextBox) {

	customerTextBox ? showOrderField()  : hidOrderField()
}
getISBSFormFileds();

