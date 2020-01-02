package com.valeo.isa;

public class Employee extends Person {
	private int id;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id) {
		super();
		this.id = id;
	}
	
	public Employee(int id,String firstName,String lastName) {
		super(firstName,lastName); // which calls parent class two arg constructor
		this.id = id;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName() + "]";
	}

	
	
}
