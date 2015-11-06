package com.carwebsite.model;

//model class of Admin
public class Admin {

	private String name;
	private String password;

	public Admin() {

	}

	public Admin(String name, String password) {

		this.name = name;
		this.password = password;

	}
	//getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
