package com.service;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.db.DB;
import com.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public boolean addEmployee(Employee emp) {

		String sql = "insert into employee(EmployeeName,Username,Address,Sex,phonenumber,Email,DateofBirth,Joindate) values('"
				+ emp.getEmployeeName() + "','" + emp.getUsername() + "','" + emp.getAddress() + "','" + emp.getSex()
				+ "','" + emp.getPhonenumber() + "','" + emp.getEmail() + "','" + emp.getDateofBirth() + "','"
				+ emp.getJoinDate() + "')";

		try {
			PreparedStatement mot = DB.getConnection().prepareStatement(sql);
			mot.execute(sql);
			return true;

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return false;
	}

}
