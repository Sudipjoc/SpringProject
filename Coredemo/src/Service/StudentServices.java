package Service;

import java.util.List;

import model.Student;

public interface StudentServices {

	void addStudent(Student s);
	void deleteStudent(int index);
	List <Student> getAll();
	
}
