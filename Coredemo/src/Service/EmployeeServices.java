package Service;

import java.util.List;

import model.Employee;

public interface EmployeeServices {
	void addEmployee(Employee e);
	void deleteEmployee(int index);
	List <Employee> getAll();

}
