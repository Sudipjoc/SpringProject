package controlstm.selection;

import java.util.Scanner;

public class IfTest {
	/*syntax :
	 *
	 *if(condition){
	 *
	 *     //statements
	 *     }
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	public static void main(String[] args) {
		
		int salary;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your salary");
		
		salary = sc.nextInt();
		if(salary<20000) {
			
		
		
		salary = salary + 5000;
		}
		System.out.println("Total salary = " + salary);
	}
	

}
