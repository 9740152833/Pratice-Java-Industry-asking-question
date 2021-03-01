package com.pratice.hprogram;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {
		String JdbcUrl = "jdbc:mysql://localhost:3306/hb-01-one-to-one-uni?useSSL=false";
		String user = "root";
		String pass = "kleit";
		try {
			System.out.println("Connecting to database");
			Class.forName("com.mysql.jdbc.Driver");
			Connection myConnection = DriverManager.getConnection(JdbcUrl, user, pass);
			System.out.println("Connection sucessfully "+ " "+myConnection);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
