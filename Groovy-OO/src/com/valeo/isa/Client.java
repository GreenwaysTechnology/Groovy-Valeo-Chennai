package com.valeo.isa;

public class Client extends Person {
	private int clientId;
	
	public Client() {
		// TODO Auto-generated constructor stub
	}

	public Client(int clientId) {
		super();
		this.clientId = clientId;
	}
	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	@Override
	public String toString() {
		return "Client [clientId=" + clientId + ", getFirstName()=" + getFirstName() + ", getLastName()="
				+ getLastName() + "]";
	}

	
		
	

}
