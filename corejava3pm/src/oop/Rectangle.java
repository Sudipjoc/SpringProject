package oop;

public class Rectangle {

	int l;
	int b;
	int a,c;
	void printArea() {
		a = l*b;
		c = 2*(l+b);
		System.out.println("Enter length+"+l);
		System.out.println("Enter breadth"+b);
		System.out.println("Area"+a);
		System.out.println("circumference"+c);
		
	}
	public static void main(String[] args) {
		
		Rectangle r= new Rectangle();
		r.l=5;
		r.b=8;
		r.printArea();
		
	}
	
}
