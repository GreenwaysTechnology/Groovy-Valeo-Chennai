//package com.valeo.ds;
//
//class Issue {
//	private int id;
//	private String desc;
//
//	public Issue() {
//		// TODO Auto-generated constructor stub
//	}
//
//	public Issue(int id, String desc) {
//		super();
//		this.id = id;
//		this.desc = desc;
//	}
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getDesc() {
//		return desc;
//	}
//
//	public void setDesc(String desc) {
//		this.desc = desc;
//	}
//
//}
//
//public class StaticDataStructure {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		int marks[] = new int[5];
//		marks[0] = 10;
//		marks[1] = 20;
//		marks[2] = 30;
//		marks[3] = 60;
//		marks[4] = 50;
//
//		// process the array
//		for (int i = 0; i < marks.length; i++) {
//			System.out.println(marks[i]);
//		}
//		// short cut
//		int scores[] = { 3, 45, 6, 78, 890, 23 };
//
//		for (int i = 0; i < scores.length; i++) {
//			System.out.println(scores[i]);
//		}
//
//		Issue issues[]= {
//				new Issue(1, "Id not available"),
//				new Issue(2,"Select control not WOrking"),
//				new Issue(3,"Checkbox control not WOrking"),
//				new Issue(4, "Radio button control not WOrking") };
//		
//		for (int j = 0; j < issues.length; j++) {
//			Issue tmpIssue = issues[j];
//			if(tmpIssue.getId() ==3)
//			System.out.println(tmpIssue.getId() + " " + tmpIssue.getDesc());
//		}
//	}
//
//}
