package abstraction;

public class Test {
	public static void main(String[] args) {
		CentralBank cb = new NabilBank();
		System.out.println(cb.getBankName());
		System.out.println(cb.getBankName());
	}

}
