package com.valeo.global;

public class ComponentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   TextBox t = ComponentAccessor.getComponent("textBox");
	   System.out.println(t.getLabel());
	   
	}

}
