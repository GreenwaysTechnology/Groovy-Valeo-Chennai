package com.valeo.myapp;

public class OperatorsDemo {

	public static void main(String[] args) {

		// arthimetic
		int a = 10;
		int b = 10;
		int r = a * b;
		System.out.println("The Result is " + r);
		// unary operator
		int x = ++a;
		System.out.println("++a " + x);
		// Comparsional operator
		int i = 100;
		int j = 30;
		boolean isSame = i == j;
		System.out.println("IS Same " + isSame);
		//logical operators
		boolean isBig=  i > j;
		System.out.println("IS Big " + isBig);


	}

}
