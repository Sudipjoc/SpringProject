package controlstm.selection;

public class ForTest2 {
	public static void main(String[] args) {
		int s, es = 0, os = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				es = es + i;

			} else
			{
				os = os + i;

			}

		}
		System.out.println(es);
		System.out.println(os);
		s=es+os;
		System.out.println(s);
	}

}
