
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class testdb {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Registered driver
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Get COnnection(url, Username, password)
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root" , "12345");
		
		// ====== Insert sql=========
		String sql = "insert into user(UserName,Password)values('Jocky','134')";
		Statement stm = con.createStatement();
		stm.execute(sql);
		con.close();
		System.out.println("added sucessfully");
		
		//======== Select sql ===========
	//	String sql = stm.executeQuery(sql);
		
		
		
		
	}
}
