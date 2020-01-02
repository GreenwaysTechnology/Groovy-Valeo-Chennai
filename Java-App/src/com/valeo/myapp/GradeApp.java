package com.valeo.myapp;

public class GradeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 10;
		char grade;
		if (score >= 95) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'A';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 55) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println("Score is " + score + " Grade is  " + grade);
	}

}
