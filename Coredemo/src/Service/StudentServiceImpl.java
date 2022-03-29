package Service;

import java.util.ArrayList;
import java.util.List;

import model.Student;

public class StudentServiceImpl implements StudentServices {

	private static List<Student> slist = new ArrayList<>();

	@Override
	public void addStudent(Student s) {

		slist.add(s);
		System.out.println("size = " +slist.size());

	}

	@Override
	public void deleteStudent(int index) {

		slist.remove(index);
	}

	@Override
	public List<Student> getAll() {

		return slist;
	}

}
