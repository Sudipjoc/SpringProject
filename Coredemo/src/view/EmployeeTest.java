package view;

import java.util.Scanner;

import Service.EmployeeServices;
import Service.EmployeeserviceImpl;
import model.Employee;


public class EmployeeTest {
	public static void main(String[] args) {
		
		EmployeeServices ss = new EmployeeserviceImpl();
		String Flag = "y";
		Scanner sc = new Scanner(System.in);
		
		do {
			Employee e =new Employee();
			System.out.println("Enter First name");
			e.setFname(sc.next());
			
			System.out.println("Enter Last name");
			e.setLname(sc.next());
			
			System.out.println("Enter age");
			e.setAge(sc.nextInt());
			
			System.out.println("Enter Department");
			e.setDepartment(sc.next());
			
			System.out.println("Enter phone number");
			e.setPhoneno(sc.next());
			
			System.out.println("Enter your address");
			e.setAddress(sc.next());
			
			ss.addEmployee(e);
			
			System.out.println("Do you want to continue [Y/N]");
			Flag = sc.next();
			
			
			
			
		}
	}
	

}
