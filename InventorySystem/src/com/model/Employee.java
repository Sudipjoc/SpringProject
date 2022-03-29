package com.model;

import java.sql.Date;

public class Employee {
	private int id;
	private String fname;
	private String lname;
	private String middlename;
	private String address;
//	private String phoneno;
	private String email;
//	private String gender;
//	private String city;
//	private int salary;
//	private int age;
//	private Date joindate;
//	private Date dob;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
