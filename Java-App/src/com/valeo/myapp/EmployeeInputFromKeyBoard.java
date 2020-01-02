package com.valeo.myapp;

import java.util.Scanner;

public class EmployeeInputFromKeyBoard {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Employee emp = new Employee();
		System.out.println("Enter Employee Id");
		emp.id = Integer.parseInt(input.nextLine());
	
		System.out.println("Enter Employee Name");
		
		emp.name = input.nextLine();
		
		System.out.println("Enter Salary ");
		emp.salary  =Double.parseDouble(input.nextLine());
		// Report
		System.out.println("Employee Details");
		System.out.println("Id : " + emp.id);
		System.out.println("Name : " + emp.name);
		System.out.println("Salary : " + emp.salary);
		

		
		
	}
}
