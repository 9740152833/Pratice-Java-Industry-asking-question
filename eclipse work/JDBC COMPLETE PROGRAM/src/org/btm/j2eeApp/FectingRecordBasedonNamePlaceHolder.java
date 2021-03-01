package org.btm.j2eeApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class FectingRecordBasedonNamePlaceHolder {
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String qry="select * from btm.student where name=?";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name");
		String name=sc.next();
		sc.close();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=akash");
		pstmt=con.prepareStatement(qry);
		pstmt.setString(1, name);
		rs=pstmt.executeQuery();
		if(rs.next()){
			int id=rs.getInt(1);
			double perc=rs.getDouble(3);
			System.out.println(id+" "+perc);
		}else{
			System.out.println("name is not matched"+name);
		}
		
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally{
			if(rs!=null){
				try {
					rs.close();
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
			}if(con!=null){
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
