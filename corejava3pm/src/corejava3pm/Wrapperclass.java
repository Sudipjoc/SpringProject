package corejava3pm;

public class Wrapperclass {

	
	/*
	 *  =================wrapper class============
	 *  #every primitive data type has its respective class is known as wrapper class.
	 *  
	 *  primitive type        wrapper class
	 *  ---------------       ---------------
	 * byte                   Byte
	 * short				  Short
	 * int					  Integer
	 * long					  Long
	 * float                  Float
	 * double                 Double
	 * char                   Character
	 * boolean                Boolean
	 * 
	 */
	
	
	
	public static void main(String[] args) {
		
		//'a' is int variable only
		int a = 500;
		
		//'x' is int variable and object also
		
		Integer x = 400;
		
		
		//-------auto boxing ----------
		//==== Primitive type (variable) change into wrapper type (object)
		
		//example//
		
		int p = 9000;
		Integer k = p ; //auto boxing
		
		//==========auto un-boxing=========
		//wrapper type change into primitice type 
		
		//example
		
		
		Double d = 3434343.324324;
		double m = d; ///auto un-boxing///
		
		
		System.out.println(Integer.toBinaryString(700));
		System.out.println(Integer.toOctalString(700));
		System.out.println(Integer.toHexString(700));
		
		
		
		
		
		
		
		
	}
	
	
	
}
