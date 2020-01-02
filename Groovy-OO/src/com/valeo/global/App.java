package com.valeo.global;

public class App {
	public static void main(String[] args) {

		System.out.println(Message.INFO_MESSAGE);

		String userName = "admin";
		String password = "admin";
		
		//Message.SUCCESS_MESSAGE = "My success";

		if (userName.equals("admin") && password.equals("admin")) {
			System.out.println(Message.SUCCESS_MESSAGE);
		} else {
			System.out.println(Message.ERROR_MESSAGE);
		}
		////////////////////////////////////////////////////
		Log.warn("Warning...");
		Log.success("Success");
		Log.error("Error");
		
		

	}
}
