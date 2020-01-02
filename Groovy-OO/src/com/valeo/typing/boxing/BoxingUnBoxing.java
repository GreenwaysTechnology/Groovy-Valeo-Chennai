package com.valeo.typing.boxing;

public class BoxingUnBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;// primitive
		Integer ins = new Integer(20); // Reference type of declaring int 
		System.out.println(ins.intValue());  // converting Integer to int
		
		//After java 5 version
		Integer j =100; //java compiler type cast 100(prmitive) into Integer :Boxing
		Object o = j;

		int x = j; //UnBoxing : Casting Reference type to Primitive type
	}

}
