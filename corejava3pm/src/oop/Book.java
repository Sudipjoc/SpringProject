package oop;

public class Book {
	String name;
	int price;
	String authername;
	int pages;
	
	
	void printBookInfo() {
		
		System.out.println("Name ="+name);
		System.out.println("Auther name="+authername);
		System.out.println("Price= " +price);
		System.out.println("Pages= " +pages);
	}
	public static void main(String[] args) {
		Book b= new Book();
		b.name ="Math";
		b.authername = "Ram";
		b.pages =24567;
		b.price = 5000;
		b.printBookInfo();
		{
		 System.out.println();	
		 System.out.println("NEXT INFO");
		}
		
		Book c = new Book();
		c.name="Science";
		c.authername = "Janak";
		c.pages = 214213;
		c.price=500;
		c.printBookInfo();
		
		{
			System.out.println();
			System.out.println("Another INFO");
		}
		Book d = new Book();
		d.name="Social";
		d.authername = "Shyam";
		d.pages = 125676;
		d.price = 500;
		d.printBookInfo();
	}

	
}
