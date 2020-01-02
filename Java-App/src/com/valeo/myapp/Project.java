package com.valeo.myapp;

public class Project {
	private int id;
	private String name;
	private String leader;
	private String projectCreated;

//	// Constructor
	public Project() {
	}

	// arg constructor
	public Project(int id, String name, String leader, String projectCreated) {
		this.id = id;
		this.name = name;
		this.leader = leader;
		this.projectCreated = projectCreated;
	}

	// arg constructor
	public Project(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Project(int id, String name,String leader) {
		this.id = id;
		this.name = name;
		this.leader = leader;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLeader() {
		return leader;
	}

	public void setLeader(String leader) {
		this.leader = leader;
	}

	public String getProjectCreated() {
		return projectCreated;
	}

	public void setProjectCreated(String projectCreated) {
		this.projectCreated = projectCreated;
	}

}
