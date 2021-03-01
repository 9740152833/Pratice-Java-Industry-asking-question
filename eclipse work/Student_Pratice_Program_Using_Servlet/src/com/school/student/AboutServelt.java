package com.school.student;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/f3")
public class AboutServelt extends GenericServlet {

	private static final long serialVersionUID = 5785193414701484333L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("In Service");
		res.setContentType("text/htnl");
		PrintWriter out = res.getWriter();
		
		try {
			String about = req.getParameter("about");
			
			if (about.equalsIgnoreCase("two")) {
				RequestDispatcher rd = req.getRequestDispatcher("about.html");
				rd.include(req, res);
		} else {
			out.println("<html><body><centre>");
			out.println("<li><i>");
			out.println("Given details are not valid to register</i></li></br>");
			out.println("<li><i>Please try again later</i></li>");
			out.println("</centre></body></html>");
			return;
		}
	}catch (Exception e) {
		e.printStackTrace();
	}
	}

}
