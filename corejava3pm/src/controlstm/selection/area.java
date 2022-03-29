package controlstm.selection;

import java.util.Scanner;

public class area {
	public static void main(String[] args) {
		
		int l;
		int b;
		int a = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the value of l");
		l = sc.nextInt();
		
		System.out.println("enter the value of b");
		b = sc.nextInt();
		
		if(l!= 0 && b!= 0) {
			
			a = l*b;
			
		}
		
		System.out.println("The value of area is"+  a);
		
		
		
		
	}

}
