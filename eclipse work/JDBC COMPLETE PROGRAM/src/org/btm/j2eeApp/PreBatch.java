package org.btm.j2eeApp;

import java.sql.*;

public class PreBatch {
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement pstmt=null;
		PreparedStatement pstmt1=null;
		String inqry="insert into seja5.employee values(3,'dell',66.00)";
		String del="delete from btm.student where id=5";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=akash");
			pstmt=con.prepareStatement(inqry);
			pstmt.addBatch();
			int arr[]=pstmt.executeBatch();
			for (int i : arr) {
				System.out.println(i);
			}
			pstmt1=con.prepareStatement(del);
			pstmt1.addBatch();
			int arr1[]=pstmt1.executeBatch();
			for (int j : arr1) {
				System.out.println(j);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally{
			if(pstmt1!=null){
				try {
					pstmt1.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(pstmt!=null){
				try {
					pstmt.close();
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
