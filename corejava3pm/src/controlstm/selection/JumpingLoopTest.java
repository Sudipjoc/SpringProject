package controlstm.selection;

public class JumpingLoopTest {
	/*
	 * a. break; exit from loop b. continue; skip values a and b runs inside loop
	 * only
	 * 
	 * c. return; exit from method
	 * 
	 */

	public static void main(String[] args) {
		
		for(int i = 1; i< 10;i++)
		{
	
		if( i==5) {
		break;
		}
		System.out.println(i);
		
		
	}
		System.out.println("End for loop");
		}
		
}	
	


