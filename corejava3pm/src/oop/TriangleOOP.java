package oop;

public class TriangleOOP {
	int b,h;
	int a;
	
	void printArea() {
		a= 12*b*h;
		System.out.println("Enter the breadth of the triangle"+b);
		System.out.println("Enter the height of the triangle"+h);
		System.out.println("area"+a);
		
		
	}

	public static void main(String[] args) {
		
		TriangleOOP area = new TriangleOOP();
		area.b = 75;
		area.h= 2;
		area.printArea();
		
	}
}
