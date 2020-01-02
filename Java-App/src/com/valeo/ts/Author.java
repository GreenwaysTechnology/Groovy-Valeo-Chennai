package com.valeo.ts;

public class Author {
	private String name;

	public Author() {
		// TODO Auto-generated constructor stub
	}

	public Author(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Author [name=" + name + "]";
	}

}
