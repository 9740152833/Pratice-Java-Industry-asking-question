package org.btm.j2eeApp;

import java.sql.*;

public class BatchStmt {
	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		String inqry="insert into seja5.employee values(2,'akash',23200.00)";
		String upda="update btm.student set per=65.01 where id=3";
		String del="delete from btm.student where id=4";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver are loded and Register");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=akash");
		System.out.println("Establish the Connection between Driver");
			stmt=con.createStatement();
		stmt.addBatch(inqry);
		stmt.addBatch(upda);
		stmt.addBatch(del);
	int arr[]=stmt.executeBatch();
	for (int i : arr) {
		System.out.println(i);
		
	}
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
	}

}
