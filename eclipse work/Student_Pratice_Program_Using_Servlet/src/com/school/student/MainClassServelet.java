package com.school.student;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@WebServlet("/f1")
public class MainClassServelet extends HttpServlet {

	private static final long serialVersionUID = 1501096515159122408L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("In Service");
		res.setContentType("text/htnl");
		PrintWriter out = res.getWriter();
		try {
			String home = req.getParameter("home");
			String about = req.getParameter("about");
			String admissions = req.getParameter("admissions");
			String attends = req.getParameter("attends");
			String gallery = req.getParameter("gallery");
			String information = req.getParameter("information");
			String contact = req.getParameter("contact");
			String logout = req.getParameter("logout");

			if (admissions != null) {
				RequestDispatcher rd = req.getRequestDispatcher("admision.html");
				rd.include(req, res);
			} else if (about != null) {
				RequestDispatcher rd = req.getRequestDispatcher("about.html");
				rd.include(req, res);

			} else if (logout != null) {

				HttpSession hs = ((HttpServletRequest) req).getSession(false);
				System.out.println(hs);
				if (hs == null) {
					RequestDispatcher rd = req.getRequestDispatcher("LOGIN.html");
					rd.include(req, res);

				}

			} else {
				out.println("<html><body><centre>");
				out.println("<li><i>");
				out.println("Given details are not valid to register</i></li></br>");
				out.println("<li><i>Please try again later</i></li>");
				out.println("</centre></body></html>");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			out.close();
		}
	}

}
