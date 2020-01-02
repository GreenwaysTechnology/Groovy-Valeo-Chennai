package com.valeo.myapp;

public class LoopsDemo {

	public static void main(String[] args) {

		System.out.println("for loop");
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

		System.out.println("while loop");
		int j = 0;
		while (j != 10) {
			System.out.println(j);
			j++;
		}
		System.out.println("do while loop");

		int x =0;
		do {
			System.out.println(x);
			x++;
		} while (x < 10);

	}

}
