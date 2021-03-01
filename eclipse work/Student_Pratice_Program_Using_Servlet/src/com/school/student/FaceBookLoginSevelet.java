package com.school.student;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/ws")
public class FaceBookLoginSevelet extends GenericServlet {

	private static final long serialVersionUID = 1L;

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("In Service");
		res.setContentType("text/htnl");
		PrintWriter out = res.getWriter();
		String facebookuserid = req.getParameter("uid");
		String loginfacebookuserid = req.getParameter("uid1");
		
		String register = req.getParameter("reg");
		System.out.println(register);
		String submit = req.getParameter("facebook");
		System.out.println(submit);
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String qurey = "select * from akadb.facebook where useridfacebook=?";
		try {
			if (register != null && register.equals("REGISTER") ) {
				out.println("<html><head>");
				out.println("<title>Register Informatiom</title>");
				out.println("</head>");
				out.println("<body bgcolor='sky blue'>");
				out.println(facebookuserid);
				out.println("</br></br>");
				out.println("<a href='LOGINWITHFACEBOOK.html'>BACK</a><br><br>");
				out.println("</body></html>");
				MYProviderImpl m1 = new MYProviderImpl();
				m1.insertFacebookRegisterInformation(facebookuserid);
			
			} else {
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("Driver Loded");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=akash");
				System.out.println("Connection establish with Driver");
				pstmt = con.prepareStatement(qurey);
				System.out.println("platform Createded");
				pstmt.setString(1, loginfacebookuserid);
				rs = pstmt.executeQuery();
				while (rs.next()) {
					String name = rs.getString(1);
					System.out.println(name);
					if (name.equals(loginfacebookuserid)) {
						RequestDispatcher rd = req.getRequestDispatcher("main1.html");
						rd.forward(req, res);
					}
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
