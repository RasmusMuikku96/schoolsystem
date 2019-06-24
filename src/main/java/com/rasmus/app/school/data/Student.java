package com.rasmus.app.school.data;

public class Student {
	
	private static int studentId = 0;
	
	private int id;
	private String name;
	private String email;
	private String address;
	
	
	public Student(String name, String email, String address) {
		super();
		this.id = studentId++;
		this.name = name;
		this.email = email;
		this.address = address;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getId() {
		return id;
	}
	
	
	
}

