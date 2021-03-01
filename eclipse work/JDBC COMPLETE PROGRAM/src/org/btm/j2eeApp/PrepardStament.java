package org.btm.j2eeApp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PrepardStament {
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement pstmt=null;
		String qry="insert into btm.student values(?,?,?)";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded and Register");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=akash");
			System.out.println("Establish the connction between the databse server");
			pstmt=con.prepareStatement(qry);
			System.out.println("Platfrom is crateded");
			pstmt.setInt(1, 1);
			pstmt.setString(2, "akash");
			pstmt.setDouble(3, 67.89);
			pstmt.executeUpdate();
			
			pstmt.setInt(1, 2);
			pstmt.setString(2, "anu");
			pstmt.setDouble(3, 78.98);
			pstmt.executeUpdate();
			pstmt.setInt(1, 3);
			pstmt.setString(2, "hello");
			pstmt.setDouble(3, 65.88);
			pstmt.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally{
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
		System.out.println("costly resuroes close");
	}

}
