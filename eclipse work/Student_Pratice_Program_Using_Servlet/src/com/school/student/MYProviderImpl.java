package com.school.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MYProviderImpl implements MyProvider {

	@Override
	public int insertRegisterInformation(int id, String name, String pass, String mobi) {
		int count = 0;
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			String qurey = "insert into akadb.register values(?,?,?,?)";
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loded");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=akash");
			System.out.println("Connection establish with Driver");
			pstmt = con.prepareStatement(qurey);
			System.out.println("platform Createded");
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, pass);
			pstmt.setString(4, mobi);
			count = pstmt.executeUpdate();
			System.out.println("record inserteded count:" + count);
			pstmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return count;
	}

	@Override
	public Student getCustomer(int uid, String username, String pass) {
		Student s = new Student();
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			String qurey = "select * from akadb.register where uid=? and username=? and password=?";
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loded");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=akash");
			System.out.println("Connection establish with Driver");
			pstmt = con.prepareStatement(qurey);
			System.out.println("platform Createded");
			pstmt.setInt(1, uid);
			pstmt.setString(2, username);
			pstmt.setString(3, pass);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String pass1 = rs.getString(3);
				System.out.println(id + " " + name + " " + pass1);
				s.setUid(id);
				s.setName(name);
				s.setPassword(pass1);
			}
			rs.close();
			pstmt.close();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return s;
	}

	@Override
	public int insertFacebookRegisterInformation(String userid1) {
		int count = 0;
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			String qurey = "insert into akadb.facebook values(?)";
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loded");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=akash");
			System.out.println("Connection establish with Driver");
			pstmt = con.prepareStatement(qurey);
			System.out.println("platform Createded");
			pstmt.setString(1, userid1);
			System.out.println("execute");
			count = pstmt.executeUpdate();
			System.out.println("record inserteded count:" + count);
			pstmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return count;
	}


}
