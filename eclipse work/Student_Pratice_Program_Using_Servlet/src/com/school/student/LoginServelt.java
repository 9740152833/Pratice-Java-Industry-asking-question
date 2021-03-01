package com.school.student;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/f")
public class LoginServelt extends HttpServlet {

	private static final long serialVersionUID = -5608517014132777433L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("In Service");
		res.setContentType("text/htnl");
		PrintWriter out = res.getWriter();
		try {
			String uid = req.getParameter("uid");
			String uname = req.getParameter("username");
			String pass = req.getParameter("password");
			String sumbit = req.getParameter("reg");

			if (uid == null || uid.equals("") || uname == null || uname.equals("") || pass == null || pass.equals("")) {
				out.println("<html><body><centre>");
				out.println("<li><i>");
				out.println("Given details are not valid to register</i></li></br>");
				out.println("<li><i>Please try again later</i></li>");
				out.println("</centre></body></html>");
				return;
			} // if
			int uid1 = Integer.parseInt(uid);
			UserDAO u = new UserDAO();
			Student s = new Student();

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
			pstmt.setInt(1, uid1);
			pstmt.setString(2, uname);
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

				System.out.println(s.getName() + " " + s.getPassword());
			}
			rs.close();
			pstmt.close();
			con.close();

			if (sumbit.equals("LOGIN") && s.getName().equals(uname) && s.getPassword().equals(pass)) {

				req.getRequestDispatcher("main1.html").forward(req, res);

			} else {
				out.println("<!DOCTYPE html>");
				out.println("<html><head>");
				out.println("<meta http-equiv='Content-Type'  content='text/html; charset=UTF-8'>");
				out.println("<title>LOGIN Informatiom</title>");
				out.println("<body bgcolor='sky blue'>");
				out.println("<i><h2>SORRY your entering information is wrong</i></h2>");
				out.println("</body></head></html>");
			}
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			out.close();
		}
	}

}
