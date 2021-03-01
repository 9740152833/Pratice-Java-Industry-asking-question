package org.btm.j2eeApp;
import java.sql.*;
import java.util.Scanner;
public class LoginValidation {
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String qry="select username from mtb.user where name=? and password=?";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name????");
		String name=sc.next();
		System.out.println("enter the password");
		String pw=sc.next();
		sc.close();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=akash");
		pstmt=con.prepareStatement(qry);
		pstmt.setString(1, name);
		pstmt.setString(2, pw);
		rs=pstmt.executeQuery();
		if(rs.next()){
			String username=rs.getString(1);
			System.out.println("welecome "+username);
		}else{
			System.err.println("Invalid name & password");
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
