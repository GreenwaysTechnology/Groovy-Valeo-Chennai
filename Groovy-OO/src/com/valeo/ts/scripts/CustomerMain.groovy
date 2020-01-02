package com.valeo.ts.scripts


println "Create Customer Object"
def customer =new Customer();
customer.id = 100; // customer.setId(1);
customer.name ="Subramanian"; //customer.setName("Subramaian");
println "Id ${customer.id} Name ${customer.name}" //customer.getId() ,customer.getName()

def customerOne = new Customer(id:1999,name:"James");
println "Id ${customerOne.id} Name ${customerOne.name}" 

def customerTwo = new Customer(name:"Geetha",id:8888);
println "Id ${customerTwo.id} Name ${customerTwo.name}"
