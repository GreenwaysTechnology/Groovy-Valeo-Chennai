package com.valeo.car.hasa;

public class Engine {
	private int engineNo;
	private String fuelType;
	
	public Engine() {
		// TODO Auto-generated constructor stub
	}
	
	public Engine(int engineNo, String fuelType) {
		super();
		this.engineNo = engineNo;
		this.fuelType = fuelType;
	}

	public int getEngineNo() {
		return engineNo;
	}
	public void setEngineNo(int engineNo) {
		this.engineNo = engineNo;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	@Override
	public String toString() {
		return "Engine [engineNo=" + engineNo + ", fuelType=" + fuelType + "]";
	}
	
	
}
