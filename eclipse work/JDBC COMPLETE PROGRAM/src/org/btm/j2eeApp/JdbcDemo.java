package org.btm.j2eeApp;

public class JdbcDemo {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver class loded&Register");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
