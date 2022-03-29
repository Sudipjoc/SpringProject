package controlstm.selection;

import java.util.Scanner;

public class GreaterNumber {
	
	public static void main(String[] args) {
		
		int a,b;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a and b");
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (a>b) {
			System.out.println("a is greater");
			
		}
		else {
			System.out.println( "b is greater");
			
		}
		
		
		
		
	}

	private static void If(boolean b) {
		// TODO Auto-generated method stub
		
	}

}
