package methodoverriding;

public class PrabhuBank extends CentralBank {
	
	@Override
	String getBankName() {
		// TODO Auto-generated method stub
		return "Prabhu Bank" ;
		
	}
	@Override
	protected int getInterestRate() {
		// TODO Auto-generated method stub
		return 20;
	}

}
