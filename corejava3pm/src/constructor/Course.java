package constructor;

public class Course {
	private String course;
	
	public Course() {
		course = "JAVA";
	}
	
	private void showCourse() {
		System.out.println("Course is:"+course);
		
	}
	public static void main(String[] args) {
		Course course = new Course(); //Constructor called
		course.showCourse(); //Course is : JAVA
	}

}
