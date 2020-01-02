package com.valeo.car.hasa;

public class Door {
	private int doorNo;
	private String doorType;

	public Door() {
	}
	
	public Door(int doorNo, String doorType) {
		super();
		this.doorNo = doorNo;
		this.doorType = doorType;
	}


	public int getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}

	public String getDoorType() {
		return doorType;
	}

	public void setDoorType(String doorType) {
		this.doorType = doorType;
	}


	@Override
	public String toString() {
		return "Door [doorNo=" + doorNo + ", doorType=" + doorType + "]";
	}


}
