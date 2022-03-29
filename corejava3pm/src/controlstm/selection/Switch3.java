package controlstm.selection;

import java.util.Scanner;

public class Switch3 {
	public static void main(String[] args) {
		String post;
		int salary, bon, totalsalary;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the post");
		post = sc.next();
		post.toLowerCase();

		switch (post) {

		case "md":
			System.out.println("Enter your salary And bonus ");
			salary = sc.nextInt();
			bon= sc.nextInt();
			totalsalary=((salary*bon)/100);
			System.out.println("total salary "+totalsalary);

			break;

		case "CEO":
			System.out.println("Enter your salary and bonus");
			salary =sc.nextInt();
			bon = sc.nextInt();
					totalsalary=((salary*bon)/100);
			System.out.println("total salary"+totalsalary);
			break;

		case "Manager":
			System.out.println("Enter your salary and bonus");
			salary =sc.nextInt();
			bon = sc.nextInt();
					totalsalary=((salary*bon)/100);
			System.out.println("total salary"+totalsalary);
			break;
			

		case "Helper":
			System.out.println("Enter your salary and bonus");
			salary =sc.nextInt();
			bon = sc.nextInt();
					totalsalary=((salary*bon)/100);
			System.out.println("total salary"+totalsalary);
			break;

		default:

		}
	}

}
