package com.valeo.isa.ins;

public class InterfaceMain {
	public static void main(String[] args) {
        Flyable flyMethod = new Crow();
        System.out.println(flyMethod.fly());
        Crow c = (Crow)flyMethod;
        System.out.println(c.eat());
        
        Flyable airPlane = new AirPlane();
        System.out.println(airPlane.fly());
        
        Flyable spiderMan = new SpiderMan();
        System.out.println(spiderMan.fly());

	}
}
