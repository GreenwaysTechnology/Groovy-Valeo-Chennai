package com.valeo.isa;

public class AnimalMain {

	public static void main(String[] args) {
				
		Animal a =new Dog();
		a.eat();
	//	a.bark();
		byte b =(byte)10000;
		//Type casting
		Dog d = (Dog)a;
		d.bark();		
		
		Object o= new Dog();
		Dog dog=(Dog)o;
		dog.eat();
		dog.bark();
		
	}

}
