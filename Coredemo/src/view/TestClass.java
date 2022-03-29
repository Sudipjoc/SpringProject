package view;

import java.util.List;
import java.util.Scanner;

import Service.StudentServiceImpl;
import Service.StudentServices;
import model.Student;

public class TestClass {
	public static void main(String[] args) {
		StudentServices ss = new StudentServiceImpl();
		String Flag = "y";
		Scanner sc = new Scanner(System.in);
		
		
		do {
		Student s = new Student();
		
		System.out.println("Enter age");
		s.setAge(sc.nextInt());
		
		
		System.out.println("Enter Collage");
		s.setCollage(sc.next());
		
		
		System.out.println("Enter ID");
		s.setId(sc.nextInt());
		
		System.out.println("Enter First Name");
		s.setFname(sc.next());
		
		System.out.println("Enter last name");
		s.setLname(sc.next());
		
		
		System.out.println("Enter Phone number");
		s.setPhone(sc.next());
		
		
		ss.addStudent(s);
		
		System.out.println("Do you want to continu [Y/N]");
		Flag = sc.next();
		
		
		
		}while(Flag.equals("y"));
	
		List<Student> slist = ss.getAll();
		 for (Student st : slist)
			 System.out.println(st);
		 {
			 System.out.println("Enter the index of number to be delete");
			 slist.remove(sc.nextInt());
			 
			 for (Student st : slist) {
				 System.out.println(st);
			 }
		 }
		
		
	}

}
