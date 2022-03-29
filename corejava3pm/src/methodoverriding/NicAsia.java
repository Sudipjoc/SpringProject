package methodoverriding;

public class NicAsia extends CentralBank {
	@Override
	String getBankName() {
		// TODO Auto-generated method stub
		return "NIC AISA";
	}
	@Override
	protected int getInterestRate() {
		// TODO Auto-generated method stub
		return 30;
	}

}
