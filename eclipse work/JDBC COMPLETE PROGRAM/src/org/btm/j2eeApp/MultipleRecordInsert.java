package org.btm.j2eeApp;

import java.sql.*;

public class MultipleRecordInsert {
	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		String qry1="insert into btm.student values(1,'akash',66.10)";
		String qry2="insert into btm.student values(2,'arun',72.10)";
		String qry3="insert into btm.student values(3,'mallu',83.10)";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded and register");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=akash");
			System.out.println("connect to the database");
			stmt=con.createStatement();
			System.out.println("platform createded");
			stmt.executeUpdate(qry1);
			stmt.executeUpdate(qry2);
			stmt.executeUpdate(qry3);
			System.out.println("data insert!!!");
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally{
			if(stmt!=null){
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con!=null){
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("costly resource are close");
	}

}
