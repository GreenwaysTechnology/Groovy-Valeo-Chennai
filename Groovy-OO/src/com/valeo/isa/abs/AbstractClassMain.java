package com.valeo.isa.abs;

public class AbstractClassMain {
	public static void main(String[] args) {

		Bird eagle = new Eagle();
		eagle.eat();
		System.out.println(eagle.fly());
		eagle.saveBirds();
	}
}
