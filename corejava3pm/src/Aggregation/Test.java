package Aggregation;

public class Test {

	public static void main(String[] args) {
		Car c = new Car();
		
		c.setColor("white");
		c.setModel("Range Rover");
		c.setPrice("14000000");
		c.setCc("1800");
		
		
		Employee e = new Employee();
		e.setId(12);
		e.setName("Ram");
		e.setSalary(1222);
		e.setCar(c);
	
		System.out.println("ID = "+e.getId());
		System.out.println("Name = "+e.getName());
		System.out.println("Salary = "+e.getSalary());
		System.out.println("Car = "+e.getCar());
		
		
		System.out.println("Color ="+e.getCar().getColor());
		System.out.println("Model = "+e.getCar().getModel());
		System.out.println("Price ="+e.getCar().getPrice());
		System.out.println("CC = "+e.getCar().getCc());
	
	}
}
