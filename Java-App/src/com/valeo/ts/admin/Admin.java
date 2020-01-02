package com.valeo.ts.admin;

public class Admin {
	private int id;
	private String projectName;
	
	public Admin() {
		// TODO Auto-generated constructor stub
	}
	

	public Admin(int id, String projectName) {
		super();
		this.id = id;
		this.projectName = projectName;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}


	@Override
	public String toString() {
		return "Admin [id=" + id + ", projectName=" + projectName + "]";
	}
	
}
