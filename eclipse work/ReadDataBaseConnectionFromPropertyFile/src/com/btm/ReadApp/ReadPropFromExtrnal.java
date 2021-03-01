package com.btm.ReadApp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class ReadPropFromExtrnal {
	public static void main(String[] args) throws FileNotFoundException {
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		String qry="select * from btm.studentedu";
		FileInputStream f=new FileInputStream("D:\\J2ee\\progrms\\ReadPropeties\\src\\db.properties");
		Properties p=new Properties();
		try {
			p.load(f);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			Class.forName(p.getProperty("driver"));
			con=DriverManager.getConnection(p.getProperty("url"),p.getProperty("user"),p.getProperty("password"));
			stmt=con.createStatement();
			rs=stmt.executeQuery(qry);
			while(rs.next()){
				int id=rs.getInt(1);
				String name=rs.getString(2);
				String dept=rs.getString(3);
				double per=rs.getDouble(4);
				System.out.println(id+" "+name+" "+dept+" "+per);
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
