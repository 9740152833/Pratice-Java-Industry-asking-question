package org.btm.j2eeApp;

import java.sql.*;
public class JdbcDem {
	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver class loaded &Registred");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=akash");
			System.out.println("connection Established with Db server");
			stmt=con.createStatement();
			System.out.println("platform Createde");

		}catch(ClassNotFoundException|SQLException e){
			e.printStackTrace();

		}
		finally{
			if(stmt!=null){
				try{
					stmt.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
			if(con!=null){
				try{
					con.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}

		}
		System.out.println("close all costly resouces");
	}

}
