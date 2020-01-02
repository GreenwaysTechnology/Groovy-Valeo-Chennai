package com.valeo.isa;

public class ISAApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.setId(111);
		emp.setFirstName("Subramanian");
		emp.setLastName("M");
		System.out.println(emp);
		
		System.out.println("Client Details");
		Client client = new Client();
		client.setClientId(35);
		client.setFirstName("Karthik");
		client.setLastName("K");
		System.out.println(client);
		
		//via constructor
		Employee newEmp = new Employee(1333,"Subramanian","M");
		System.out.println(newEmp);
		
		
	}

}
