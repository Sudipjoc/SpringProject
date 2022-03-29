package controlstm.selection;

public class NestedIfElseTest {

	public static void main(String[] args) {

		String citizen = "nepali";
		int age = 20;
		String voterID = "yes";

		if (citizen.equals("nepali")) {

			if (age >= 18) {
				System.out.println("you can vote");
			} else {
				System.out.println("you are underage");

				if (voterID.equals("yes")) {

					System.out.println("You have voterID");

				} else {
					System.out.println("you have not voterID");

				}

			}
		}

		else {
			System.out.println("You are not nepali");

		}

	}

}
