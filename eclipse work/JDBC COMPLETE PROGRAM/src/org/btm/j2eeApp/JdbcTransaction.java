package org.btm.j2eeApp;
import java.sql.*;
import java.util.Scanner;
public class JdbcTransaction {
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement pstmt=null;
		PreparedStatement pstmt1=null;
		String inqryedu="insert into btm.studentedu values(?,?,?,?)";
		String inqryper="insert into btm.studentper values(?,?,?)";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id???");
		int id=sc.nextInt();
		System.out.println("enter the name???");
		String name=sc.next();
		System.out.println("enter the dept???");
		String dept=sc.next();
		System.out.println("enter the per???");
		double per=sc.nextDouble();
		System.out.println("enter the place???");
		String place=sc.next();
		sc.close();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=akash");
			con.setAutoCommit(false);
			pstmt=con.prepareStatement(inqryedu);
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, dept);
			pstmt.setDouble(4, per);
			pstmt.executeUpdate();
			//1st db opertion
			pstmt1=con.prepareStatement(inqryper);
			pstmt1.setInt(1, id);
			pstmt1.setString(2, name);
			pstmt1.setString(3, place);
			pstmt1.executeUpdate();
			System.out.println("Student personal Details Executede");
			//2nd db opertion
			con.commit();
		} catch (ClassNotFoundException | SQLException e) {
			try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
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
					pstmt1.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("costly resorces are close");
	}

}
