package com.model;

import java.sql.Date;

public class Employee {

	private int ID;
	private String EmployeeName;
	private String Username;
	private String Address;
	private String sex;
	private String phonenumber;
	private String Email;
	private java.util.Date DateofBirth;
	private Date JoinDate;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Date getDateofBirth() {
		return (Date) DateofBirth;
	}
	public void setDateofBirth(java.util.Date dateofBirth) {
		DateofBirth = dateofBirth;
	}
	public Date getJoinDate() {
		return JoinDate;
	}
	public void setJoinDate(Date joinDate) {
		JoinDate = joinDate;
	}

	

}
