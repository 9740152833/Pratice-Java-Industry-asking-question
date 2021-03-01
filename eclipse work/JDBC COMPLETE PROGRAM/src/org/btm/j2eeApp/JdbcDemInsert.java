package org.btm.j2eeApp;
import java.sql.*;
public class JdbcDemInsert {
	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		String qry="insert into btm.student values(4,'HI',88.10)";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver class loaded and register");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=akash");
			System.out.println("connction established with server");
			stmt=con.createStatement();
			System.out.println("platform createded");
			stmt.executeUpdate(qry);
			System.out.println("data is insertded!!!!!");
		} catch (ClassNotFoundException|SQLException e) {
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


