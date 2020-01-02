package com.valeo.car.hasa;

public class CarMaking {

	public static void main(String[] args) {
		// First create all car dependencies
		Engine engine = new Engine(12987, "Petrol");
		Door door = new Door(23, "Side Door");
		// Make car
		Car car = new Car(1819, "X-Type", engine, door);
		System.out.println(car);
		System.out.println(car.getEngine().getFuelType());
		
		//Setter binding
		Car newCar= new Car();
		newCar.setModel(3444);
		newCar.setName("Y-Model");
		newCar.setEngine(engine);
		newCar.setDoor(door);
		System.out.println(newCar);

	}

}
