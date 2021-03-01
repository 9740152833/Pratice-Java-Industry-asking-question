package org.btm.j2eeApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemDelete {
	public static void main(String[] args)  {
		Connection con=null;
		Statement stmt=null;
		String qry="delete from btm.student where id=4";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("load the driver and register the driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=akash");
			System.out.println("establish the connction between the dastabase server");
			stmt=con.createStatement();
			System.out.println("platform Creteded");
			stmt.executeUpdate(qry);
			System.out.println("data is delete!!!!!!");
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
			if(con!=null)
			{
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("Close the all costly resoures");
	}


}
