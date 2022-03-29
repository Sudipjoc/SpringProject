package constructor;

import java.util.Scanner;

public class Area1 {
	int length, breadth;

	public void setDim(int l, int b) {
		length = l;
		breadth = b;
	}

	public void getArea1() {

		int area = length * breadth;
		System.out.println("area is" + area);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int l, b;
		System.out.println("Enter the length and breadth");
		l = sc.nextInt();
		b = sc.nextInt();
		Area1 area = new Area1();
		area.setDim(l, b);

	}

}
