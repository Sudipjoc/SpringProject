package Inheritance;

public class Programmer extends Employee{
	String proglang;
	String projectname;
	int bonus;
	
	public static void main(String[] args) {
		Programmer p = new Programmer();
		
		p.age = (12);
		p.bonus = (2000);
		p.projectname = ("TestRun");
		p.id = (122);
		p.name = ("Ghyansham");
		p.salary = (40000);
		p.proglang = ("Java");
		
		System.out.println("Age is "+p.age);
		System.out.println("His bonus is "+p.bonus);
		System.out.println("The project name is "+p.projectname);
		System.out.println("The id number is "+p.id);
		System.out.println("His name is "+p.name);
		System.out.println("Salary is "+p.salary);
		System.out.println("The programming language is "+p.proglang);
		
		
		
		
	}
	
	
	
}
