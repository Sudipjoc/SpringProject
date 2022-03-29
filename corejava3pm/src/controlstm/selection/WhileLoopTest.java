package controlstm.selection;

public class WhileLoopTest {

	/*
	 *while(condition){
	 * 	 //statements
	 *  // increasment/decreasment
	 *   
	 *   }
	 */
	public static void main(String[] args) {
		
		int n= 5;
		int fact = 1;
		
		while(n>1) {
			
			fact = fact*n;
			n--;
			
			
		}
		
		System.out.println(fact);
	}
	
	
}

