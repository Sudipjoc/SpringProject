package controlstm.selection;

import java.util.Scanner;

public class SimpleInterest {
	public static void main(String[] args) {
		
		
		int principle;
		int rate;
		int time;
		int SI= 0;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter principle");
		principle = sc.nextInt();
		
		System.out.println("Enter time");
		time = sc.nextInt();
		
		System.out.println("Enter rate");
		rate = sc.nextInt();
		
		if(principle!= 0 && rate!= 0 && time!= 0) {
		SI = (principle*time*rate/100);
		}
	
		
		
		System.out.println("Simple Interest = "+ SI);
		
		
	}

}
