package methodoverriding;

public class Test {
	public static void main(String[] args) {
		
		//static or early binding of object.
		NabilBank nb = new NabilBank();
		System.out.println("Bank Name = "+nb.getBankName());
		System.out.println("Rate = "+nb.getInterestRate());
		
		//up-casting
		
	CentralBank cb =new PrabhuBank();
		System.out.println(cb);
		
		
		//late or dynamic binding of object
		void printBankinfo(CentralBank b) {
			System.out.println("Bank = "+b.getBankName()) ;
			System.out.println("Bank ="+b.getInterestRate());
			
		}
		
		
	}

}
