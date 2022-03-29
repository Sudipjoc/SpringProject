package methodoverriding;

public class CentralBank {
	String getBankName() {
		return "Central Bank" ;
		
	}
	protected int getInterestRate() {
		return 0;
		
	}
	
	public void moneyExRate() {
		System.out.println("1$ = 117");
		System.out.println("KDD1 = 15");
		System.out.println("IC 100 = 160");
	
	}
	

}
