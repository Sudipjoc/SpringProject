package encapsulation;

public class Test {

	
	public static void main(String[] args) {
		
		Customer c = new Customer();
		
		c.setAge(23);
		c.setCity("Pokhara");
		c.setId(933);
		c.setPhone("985891212");
		c.setName("Hari");
		
		
		System.out.println("id = "+c.getId());
		System.out.println("Name = "+c.getName());
		System.out.println("City = " +c.getCity());
		System.out.println("Age = "+c.getAge());
		System.out.println("phone = "+c.getPhone());
		
	}
}
