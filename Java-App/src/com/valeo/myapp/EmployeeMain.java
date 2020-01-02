package com.valeo.myapp;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Employee Object Creation(Memory Allocation)");
		Employee emp =new Employee();
		//to assign values
		emp.id =1;
		emp.name ="Ram";
		emp.salary =10000;
		emp.address = "Chennai";
		emp.mobileNo ="983390898";
		emp.bloodgroup ="A+";
		emp.experience=10;
		System.out.println("Id : " + emp.id);
		System.out.println("Name : " + emp.name);
		System.out.println("Salary : " + emp.salary);
		System.out.println("Address : " + emp.address);
		System.out.println("Mobile No : " + emp.mobileNo);
		System.out.println("Experience : " + emp.experience);
		
		Employee emp1 =new Employee();
		//to assign values
		emp1.id =12;
		emp1.name ="Subramanian";
		emp1.salary =10000;
		emp1.address = "Chennai";
		emp1.mobileNo ="983390898";
		emp1.bloodgroup ="A+";
		emp1.experience=10;
		System.out.println("Id : " + emp1.id);
		System.out.println("Name : " + emp1.name);
		System.out.println("Salary : " + emp1.salary);
		System.out.println("Address : " + emp1.address);
		System.out.println("Mobile No : " + emp1.mobileNo);
		System.out.println("Experience : " + emp1.experience);
		

	}

}
