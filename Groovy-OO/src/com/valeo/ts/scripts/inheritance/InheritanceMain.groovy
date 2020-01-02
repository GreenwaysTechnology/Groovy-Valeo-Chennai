package com.valeo.ts.scripts.inheritance



def  emp = new Employee(empId:1,firstName:'Subramanain',lastName:'M');
println "${emp.empId} ${emp.firstName} ${emp.lastName} ";

def client = new Client(clientId:134,firstName:'Karthik',lastName:'M');
println "${client.clientId} ${client.firstName} ${client.lastName} ";
