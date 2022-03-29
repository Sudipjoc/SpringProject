package com.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.db.DB;
import com.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public boolean addEmployee(Employee emp) {

		// Write insert sql
		String sql = "insert into employee(fname,lname,city,country,department,email,gender,phone,post,age,dob,salary,joindate,state,companyname)values('"
				+ emp.getFname() + "','" + emp.getLname() + "' ,'" + emp.getCity() + "','" + emp.getCountry() + "','"
				+ emp.getDepartment() + "','" + emp.getEmail() + "','" + emp.getGender() + "','" + emp.getPhone()
				+ "','" + emp.getPost() + "','" + emp.getAge() + "','" + emp.getDob() + "','" + emp.getSalary() + "','"
				+ emp.getJoindate() + "','" + emp.getState() + "','" + emp.getCompanyName() + "')"; // SQL adding
																									// statement
		try {
//prepared statement
			PreparedStatement pstm = DB.getConnection().prepareStatement(sql);
//			pstm.setString(1, emp.getFname());
//			pstm.setString(2, emp.getLname());
//			pstm.setString(3, emp.getCity());
//			pstm.setString(4, emp.getCountry());
//			pstm.setString(5, emp.getDepartment());
//			pstm.setString(6, emp.getEmail());
//			pstm.setString(7, emp.getGender());
//			pstm.setString(8, emp.getPhone());
//			pstm.setString(9, emp.getPost());
//			pstm.setInt(10, emp.getAge());
//			pstm.setDate(11, emp.getDob());
//			pstm.setInt(12, emp.getSalary());
//			pstm.setDate(13, emp.getJoindate());
//			pstm.setString(14, emp.getState());
//			pstm.setString(15, emp.getCompanyName());

			pstm.execute(sql);

			return true;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean deleteEmployee(int id) {
		// TODO Auto-generated method stub
		String sql = "delete from employee where id =" + id;
		try {
			Statement stm = DB.getConnection().createStatement();
			stm.execute(sql);
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Employee getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> empList = new ArrayList<>();
		// TODO Auto-generated method stub
		String sql = "select *from employee";
		try {
			Statement stm = DB.getConnection().createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while (rs.next()) {
				Employee emp = new Employee();

				emp.setId(rs.getInt("id"));
				emp.setFname(rs.getString("fname"));
				emp.setLname(rs.getString("lname"));
				emp.setAge(rs.getInt("age"));
				emp.setGender(rs.getString("gender"));
				emp.setCompanyName(rs.getString("company name"));
				emp.setPost(rs.getString("post"));
				emp.setDepartment(rs.getString("department"));
				emp.setSalary(rs.getInt("salary"));
				emp.setDob(rs.getDate("dob"));
				emp.setJoindate(rs.getDate("join date"));
				emp.setCity(rs.getString("City"));
				emp.setPhone(rs.getString("phone"));
				emp.setEmail(rs.getString("email"));
				emp.setState(rs.getString("state"));

				empList.add(emp);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return empList;
	}

	@Override
	public List<Employee> searchEmployee(String searchData) {
		// TODO Auto-generated method stub
		List<Employee> empList = new ArrayList<>();

		String sql = "select * from employee where fname like'%" + searchData + "%' OR post like'%" + searchData
				+ "%' ";
		try {
			Statement stm = DB.getConnection().createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while (rs.next()) {
				Employee emp = new Employee();

				emp.setId(rs.getInt("id"));
				emp.setFname(rs.getString("fname"));
				emp.setLname(rs.getString("lname"));
				emp.setAge(rs.getInt("age"));
				emp.setGender(rs.getString("gender"));
				emp.setCompanyName(rs.getString("company name"));
				emp.setPost(rs.getString("post"));
				emp.setDepartment(rs.getString("department"));
				emp.setSalary(rs.getInt("salary"));
				emp.setDob(rs.getDate("dob"));
				emp.setJoindate(rs.getDate("join date"));
				emp.setCity(rs.getString("City"));
				emp.setPhone(rs.getString("phone"));
				emp.setEmail(rs.getString("email"));
				emp.setState(rs.getString("state"));

				empList.add(emp);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return empList;

	}

}
