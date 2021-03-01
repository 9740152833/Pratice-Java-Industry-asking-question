package com.school.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDAO {
	public boolean validate(String uname, String pass) throws ClassNotFoundException, SQLException {
		try {
			Connection con = null;
			Statement st = null;
			ResultSet rs = null;
			String qurey = "select count(*) from akadb.register where username=\'" + uname + "\' and password=\'" + pass + "\'";
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loded");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=akash");
			System.out.println("Connection establish with Driver");
			st = con.createStatement();
			rs = st.executeQuery("select count(*) from akadb.register where username=\'" + uname + "\' and password=\'" + pass + "\'");
			System.out.println("platform Createded");
			return rs.next();

		} // try
		catch (Exception e) {
			e.printStackTrace();
		}
		return false;

	}

}
