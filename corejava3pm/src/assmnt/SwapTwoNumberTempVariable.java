package assmnt;

import java.util.Scanner;

public class SwapTwoNumberTempVariable {
	public static void main(String[] args) {
		
		int a,b;
		int tw;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of a and b");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("before swapping numbers \n"+ a +"\n" +b);
		
		
		//after swapping
		

		tw = a;
		a=b;
		b= tw;
		System.out.println("after swapping numbers \n"+a + "\n" +b);
		
		
	}

}
