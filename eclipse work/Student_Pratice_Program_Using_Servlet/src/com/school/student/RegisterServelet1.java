package com.school.student;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/fs")
public class RegisterServelet1 extends GenericServlet {

	
	private static final long serialVersionUID = 766467011816787005L;

	public RegisterServelet1() {
		super();

	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		System.out.println("In Service");
		res.setContentType("text/htnl");
		PrintWriter out = res.getWriter();

		try {
			String uid = req.getParameter("uid");
			String uname = req.getParameter("username");
			String pass = req.getParameter("password");
			String mobile = req.getParameter("number");
			String gender = req.getParameter("gender");
			String age = req.getParameter("age");
			String[] CLASS = req.getParameterValues("class");
			if (uid == null || uid.equals("") || uname == null || uname.equals("") || pass == null || pass.equals("")) {
				out.println("<html><body><centre>");
				out.println("<li><i>");
				out.println("Given details are not valid to register</i></li></br>");
				out.println("<li><i>Please try again later</i></li>");
				out.println("</centre></body></html>");
				return;
			} // if
			int udi1 = Integer.parseInt(uid);
			MyProvider m = new MYProviderImpl();
			m.insertRegisterInformation(udi1, uname, pass, mobile);
			Student s= new Student();
			System.out.println(s.getName());
			out.println("<!DOCTYPE html>");
			out.println("<html><head>");
			out.println("<meta http-equiv='Content-Type'  content='text/html; charset=UTF-8'>");
			out.println("<title>Register Informatiom</title>");
			out.println("<body bgcolor='sky blue'>");
			out.println("<i><h2>TAKING FOR REGISTERING MY WEBSITE</i></h2>");

			if (uid == null) {
				out.println("<p>uid:MISSING</p>");
			} else {
				out.println("<p>UID:" + uid + "</p>");
			}

			if (pass == null) {
				out.println("<p>USERNAME:MISSING</p>");
			} else {
				out.println("<p>USERNAME:" + uname + "</p>");
			}
			if (pass == null) {
				out.println("<p>PASSWORD:MISSING</p>");
			} else {
				out.println("<p>PASSWORD:" + pass + "</p>");
			}
			if (mobile == null) {
				out.println("<p>MOBILENUMBER:MISSING</p>");
			} else {
				out.println("<p>MOBILENUMBER:" + mobile + "</p>");
			}
			// retrive the value of the qurey parameters genders

			if (gender == null) {
				out.println("<p>GENDER:MISSING</p>");
			} else if (gender.equals("m")) {
				out.println("<p>Gender:male</p>");
			} else {
				out.println("<p>Gender:Female</p>");
			}
			//// retrive the value of the qurey parameters age
			if (age == null) {
				out.println("<p>AGE:MISSING</p>");
			} else if (age.equals("1")) {
				out.println("<p>AGE:&lt;1year old</p>");
			} else if (age.equals("99")) {
				out.println("<p>AGE:1 to 99 Year Old</p>");
			} else {
				out.println("<p>AGE:&gt;99year old</p>");

			}
			if (CLASS == null || CLASS.length == 0) {
				out.println("<p>CLASS:MISSING</p>");
			} else {
				for (String cl : CLASS) {
					if (cl.equals("8")) {
						out.println("<p>CLASS:8</p>");
					} else if (cl.equals("9")) {
						out.println("<p>CLASS:9</p>");
					} else {
						out.println("<p>CLASS:10</p>");
					}
				}

			}

			out.println("<a href='index.html'>BACK</a></br></br>");
			out.println("<a href='LOGIN.html'>LOGINPAGE</a>");
			out.println("</body></html>");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			out.close();

		}

	}

}
