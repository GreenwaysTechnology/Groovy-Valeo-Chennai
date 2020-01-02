package com.valeo.myapp;

import java.util.Scanner;

public class ProjectMain {

	public static void main(String[] args) {
		// TODO Auto-generaited method stub
		Project pro = new Project();
		// pro.id=1;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter PRoject Id");
		pro.setId(Integer.parseInt(input.nextLine()));
		System.out.println("Enter PRoject Name");
		pro.setName(input.nextLine());

		// System.out.println(pro.id);
		System.out.println(" Project Id :" + pro.getId());
		System.out.println(" Project Name :" + pro.getName());
		///////////////////////////////////////////////////////////////
		Project project = new Project(12, "Control Panel", "ThangaVel", "12-10-2018");
		System.out.println(" Project Id :" + project.getId());
		System.out.println(" Project Name :" + project.getName());
		System.out.println(" Project Leader :" + project.getLeader());
		System.out.println(" Project Created On :" + project.getProjectCreated());

		Project project1 = new Project(14, "SLA");
		System.out.println(" Project Id :" + project1.
				getId());
		System.out.println(" Project Name :" + project1.getName());
		System.out.println(" Project Created On :" + project1.getProjectCreated());

	}

}
