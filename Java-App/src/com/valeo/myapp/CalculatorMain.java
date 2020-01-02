package com.valeo.myapp;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {

		Calculator calc = new Calculator();
		// calc.a =10;
		// calc.b =20;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a");
		calc.a = Integer.parseInt(input.nextLine());
		System.out.println("Enter b");
		calc.b = Integer.parseInt(input.nextLine());
	
		int result = 0;
		result = calc.add();
		System.out.println("Addition Result : " + result);
		result = calc.substract();
		System.out.println("Substract Result : " + result);

		result = calc.divide();
		System.out.println("Division Result : " + result);
		result = calc.multiply();
		System.out.println("Multiplication Result : " + result);
	}

}
