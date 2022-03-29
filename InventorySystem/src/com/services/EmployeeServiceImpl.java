package com.services;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.db.DB;
import com.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public boolean addEmployee(Employee emp) {

		String sql = "insert into employee(Firstname,Middlename,Lastname,address,Email) values(?,?,?,?,?)";
		
//		String sql = "insert into employee(Firstname,Middlename,Lastname,address,Email) values('" + emp.getFname()
//				+ "','" + emp.getMiddlename() + "','" + emp.getLname() + "','" + emp.getEmail() + "','"
//				+ emp.getAddress() + "')";

		try {
			PreparedStatement dmd = DB.getConnection().prepareStatement(sql);
			dmd.setString(1, emp.getFname());
			dmd.setString(2, emp.getMiddlename());
			dmd.setString(3, emp.getLname());
			dmd.setString(3, emp.getAddress());
			dmd.setString(5, emp.getEmail());
			
		

			dmd.execute(sql);
			return true;
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return false;
	}

}
