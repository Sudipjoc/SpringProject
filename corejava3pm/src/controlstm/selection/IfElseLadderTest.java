package controlstm.selection;

import java.util.Scanner;

public class IfElseLadderTest {
	
	public static void main(String[] args) {
		
		
		int marks;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your marks");
		marks = sc.nextInt();
		
		if(marks >=80) {
			
			System.out.println("you got distinction");
		}
		else if(marks >=60) {
			System.out.println("you got first division");
			
		}
		else if(marks>=50) {
			System.out.println("you got second division");
		}
		else if(marks >=40) {
			System.out.println("you got third division");
			
		}
		else {
			System.out.println("you are fail");
		}
		}
		
		
		
		
	}


