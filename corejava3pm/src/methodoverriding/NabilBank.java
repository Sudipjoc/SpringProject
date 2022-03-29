package methodoverriding;

public class NabilBank extends CentralBank {
	
	@Override
	String getBankName() {
		// TODO Auto-generated method stub
		return"NabilBank";
	}
	@Override
	protected int getInterestRate() {
		// TODO Auto-generated method stub
		return 10;
	}
 
	
}
