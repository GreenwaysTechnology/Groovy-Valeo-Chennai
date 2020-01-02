package com.valeo.myapp;

public class DecisionMaking {
	public static void main(String[] args) {
		// decision making : if..else
		int a = 100;
		int b = 10;
		if (a >= b) {
			System.out.println("Is Big");
		} else {
			System.out.println("Not Big");
		}
		// short cut for if..else : tenary operator
		String result = (a >= b) ? "Is Big" : "Not Big";
		System.out.println(result);

	}

}
