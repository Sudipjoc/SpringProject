package com.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
	public static Connection getConnection() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/simple", "root", "12345");

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;

	}
}
