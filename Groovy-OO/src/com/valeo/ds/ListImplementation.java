package com.valeo.ds;

import java.util.ArrayList;

class Issue {
	private int id;
	private String desc;

	public Issue() {
		// TODO Auto-generated constructor stub
	}

	public Issue(int id, String desc) {
		super();
		this.id = id;
		this.desc = desc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}

public class ListImplementation {
	public static void main(String[] args) {

		ArrayList<Integer> numList = new ArrayList<>();
		numList.add(12);
		numList.add(13);
		numList.add(14);

		//
		for (Integer x : numList) {
			System.out.println(x);
		}

		ArrayList<Issue> issues = new ArrayList<>();
		issues.add(new Issue(1, "Id not available"));
		issues.add(new Issue(2, "Select control not WOrking"));
		issues.add(new Issue(3, "Checkbox control not WOrking"));
		issues.add(new Issue(4, "Radio button control not WOrking"));

		for (Issue issue : issues) {
			System.out.println(issue.getId() + " " + issue.getDesc());
		}

	}
}
