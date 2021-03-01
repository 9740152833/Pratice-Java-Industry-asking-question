package org.btm.j2eeApp;
import java.sql.*;
import java.util.Scanner;
public class FetchingParticularRecord {
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String qry="select * from btm.student where id=?";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id???");
		int id=sc.nextInt();
		sc.close();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=akash");
		pstmt=con.prepareStatement(qry);
		pstmt.setInt(1, id);
		rs=pstmt.executeQuery();
		if(rs.next()){
			String name=rs.getString(2);
			double perc=rs.getDouble(3);
			System.out.println(name+" "+perc);
		}else{
			System.err.println("id is not persenr"+ id);
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
