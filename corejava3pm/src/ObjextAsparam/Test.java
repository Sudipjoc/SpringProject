package ObjextAsparam;

public class Test {

	public static void main(String[] args) {
		
		Student st = new Student();
		st.setId(888);
		st.setFname("Raju");
		st.setLname("Thapa");
		st.setAge(30);
		st.setCity("ktm");
		st.setCollage("NCC");
		
		Test t = new Test();
		Student st = t.getStudentData();
		t.print(st);
		
		
	}
	
}

// ============= object as arguments =====
void print (Student s) {
	System.out.println("Id = "s.getId());
	System.out.println("FirstName =" +);
}




// =========object as return type =====
Student getStudentData() {
	
	Student st = new Student();
	
	
	st.setId(888);
	st.setFname("Raju");
	st.setLname("Thapa");
	st.setAge(30);
	st.setCity("ktm");
	st.setCollage("NCC");
	
	
	return st;
	
	
	
}
