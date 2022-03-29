package model;

public class Student {
	int id;
	String fname, Lname,Collage,Phone;
	int age;
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
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public String getCollage() {
		return Collage;
	}
	public void setCollage(String collage) {
		Collage = collage;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", fname=" + fname + ", Lname=" + Lname + ", Collage=" + Collage + ", Phone="
				+ Phone + ", age=" + age + "]";
	}
	
	

}
