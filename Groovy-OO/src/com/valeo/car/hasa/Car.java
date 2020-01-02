package com.valeo.car.hasa;

public class Car {
    private int model;
    private String name;
    //has-a
    private Engine engine;
    private Door  door;
    
    public Car() {
		// TODO Auto-generated constructor stub
	}
    
	public Car(int model, String name, Engine engine, Door door) {
		super();
		this.model = model;
		this.name = name;
		this.engine = engine;
		this.door = door;
	}
	

	public Car(Engine engine) {
		super();
		this.engine = engine;
	}

	
	public Car(Engine engine, Door door) {
		super();
		this.engine = engine;
		this.door = door;
	}

	public Car(Door door) {
		super();
		this.door = door;
	}

	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public Door getDoor() {
		return door;
	}
	public void setDoor(Door door) {
		this.door = door;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", name=" + name + ", engine=" + engine + ", door=" + door + "]";
	}
    
    
  
}
