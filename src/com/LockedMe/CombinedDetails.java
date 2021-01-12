package com.LockedMe;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CombinedDetails {
	
	public void display() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException, Exception {
		String url= "jdbc:mysql://localhost:3306/employeedatabase";
		String username= "root";
		String password ="G@123@put";
		String query= "SELECT * FROM employeedatabase.employeedetails";

		Class.forName("com.mysql.jdbc.Driver");
		Connection con= DriverManager.getConnection(url, username, password);
		Statement st =con.createStatement();
		ResultSet rs=st.executeQuery(query);
		if(con!=null) {
			System.out.println("The complete Employee Details: ");
		}
		
		while (rs.next()) {
		String userData= rs.getInt(1) +" : "+rs.getString(2)+" : "+rs.getInt(3)+ " : "+rs.getString(4)+" : "+rs.getInt(5);
		System.out.println(userData);
		}
		st.close();
		con.close();
		
	}

}
