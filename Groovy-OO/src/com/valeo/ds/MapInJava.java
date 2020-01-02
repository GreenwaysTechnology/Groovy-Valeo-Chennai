package com.valeo.ds;

import java.util.HashMap;

public class MapInJava {
	public static void main(String[] args) {
		
		HashMap<Integer, String> userInfo = new HashMap<>();
		
		//
		userInfo.put(1, "admin");
		userInfo.put(2, "guest");
		userInfo.put(3, "smartoffice");
		
		System.out.println(userInfo);
		
		HashMap<String, String> userDb = new HashMap<>();
		userDb.put("OU-1", "IN");
		userDb.put("OU-2", "FR");
		userDb.put("OU-3", "US");

		System.out.println(userDb);
	}
}
