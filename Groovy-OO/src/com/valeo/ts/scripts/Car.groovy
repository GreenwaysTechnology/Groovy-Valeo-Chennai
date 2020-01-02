package com.valeo.ts.scripts

class Car {
	int model;
	String name;
	//has-a
	Engine engine;
	Door  door;

	@Override
	public String toString() {
		return "Car [model=" + model + ", name=" + name + ", engine=" + engine + ", door=" + door + "]";
	}
}
