package controlstm.selection;

import java.util.Scanner;

public class SwitchCountryTest {
	public static void main(String[] args) {
		
		String cn;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Country name");
		cn = sc.next();
		cn.toLowerCase();
		switch(cn){
			
			
		case "Nepal":
			System.out.println("Kathamandu");
			break;
			
		case "India":
			System.out.println("Delhi");
			break;
			
		case "Japan":
			System.out.println("Tokyo");
			break;
			
		case "America":
			System.out.println("Washinton DC");
			break;
			
			default;
			
		
	
		}
		
	}

}
