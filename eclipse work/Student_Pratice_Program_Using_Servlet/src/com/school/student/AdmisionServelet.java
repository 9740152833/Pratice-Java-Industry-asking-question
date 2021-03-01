package com.school.student;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/f2")
public class AdmisionServelet extends GenericServlet {
	private static final long serialVersionUID = 7564218346070380658L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("In Service");
		res.setContentType("text/htnl");
		PrintWriter out = res.getWriter();

		try {
			String First_Name = req.getParameter("First_Name");
			String Last_Name = req.getParameter("Last_Name");
			String Birthday_day = req.getParameter("Birthday_day");
			String Birthday_Month = req.getParameter("Birthday_Month");
			String Birthday_Year = req.getParameter("Birthday_Year");
			String Email_Id = req.getParameter("Email_Id");
			String Mobile_Number = req.getParameter("Mobile_Number");
			String Gender = req.getParameter("Gender");
			String Address = req.getParameter("Address");
			String City = req.getParameter("City");
			String Pin_Code = req.getParameter("Pin_Code");
			String State = req.getParameter("State");
			String Country = req.getParameter("Country");
			String[] Hobby = req.getParameterValues("Hobby");
			String ClassVII_Board = req.getParameter("ClassVII_Board");
			String ClassVII_Percentage = req.getParameter("ClassVII_Percentage");
			String ClassVII_YrOfPassing = req.getParameter("ClassVII_YrOfPassing");
			String Course = req.getParameter("Course");
			String Submit = req.getParameter("sub");

			if (First_Name == null || First_Name.equals("") || Last_Name == null || Last_Name.equals("")) {
				out.println("<html><body><centre>");
				out.println("<li><i>");
				out.println("Given details are not valid to register</i></li></br>");
				out.println("<li><i>Please try again later</i></li>");
				out.println("</centre></body></html>");
				return;
			} // if

			out.println("<!DOCTYPE html>");
			out.println("<html><head>");
			out.println("<meta http-equiv='Content-Type'  content='text/html; charset=UTF-8'>");
			out.println("<title>Register Informatiom</title>");
			out.println("<body bgcolor='sky blue'>");
			out.println("<i><h2>YOUR INFORMATION IS SUCCESSFUL STORED</i></h2>");
			if (Submit.equals(Submit)) {
				if (First_Name == null) {
					out.println("<p>First_Name:MISSING</p>");
				} else {
					out.println("<p>First_Name:" + First_Name + "</p>");
				} // 1

				if (Last_Name == null) {
					out.println("<p>Last_Name: MISSING</p>");
				} else {
					out.println("<p>Last_Name:" + Last_Name + "</p>");
				} // 2

				if (Birthday_day == null) {
					out.println("<p>Birthday_day: MISSING</p>");
				} else if (Birthday_day.equals("1")) {
					out.println("<p>Birthday_day:" + Birthday_day + "</p>");
				} else if (Birthday_day.equals("2")) {
					out.println("<p>Birthday_day:" + Birthday_day + "</p>");
				} else if (Birthday_day.equals("3")) {
					out.println("<p>Birthday_day:" + Birthday_day + "</p>");
				} else if (Birthday_day.equals("4")) {
					out.println("<p>Birthday_day:" + Birthday_day + "</p>");
				} else if (Birthday_day.equals("5")) {
					out.println("<p>Birthday_day:" + Birthday_day + "</p>");
				} else if (Birthday_day.equals("6")) {
					out.println("<p>Birthday_day:" + Birthday_day + "</p>");
				} else if (Birthday_day.equals("7")) {
					out.println("<p>Birthday_day:" + Birthday_day + "</p>");
				} else if (Birthday_day.equals("8")) {
					out.println("<p>Birthday_day:" + Birthday_day + "</p>");
				} else if (Birthday_day.equals("9")) {
					out.println("<p>Birthday_day:" + Birthday_day + "</p>");
				} else if (Birthday_day.equals("10")) {
					out.println("<p>Birthday_day:" + Birthday_day + "</p>");
				} else if (Birthday_day.equals("11")) {
					out.println("<p>Birthday_day:" + Birthday_day + "</p>");
				} else if (Birthday_day.equals("12")) {
					out.println("<p>Birthday_day:" + Birthday_day + "</p>");
				} else if (Birthday_day.equals("13")) {
					out.println("<p>Birthday_day:" + Birthday_day + "</p>");
				} else if (Birthday_day.equals("14")) {
					out.println("<p>Birthday_day:" + Birthday_day + "</p>");
				} else if (Birthday_day.equals("15")) {
					out.println("<p>Birthday_day:" + Birthday_day + "</p>");
				} else if (Birthday_day.equals("16")) {
					out.println("<p>Birthday_day:" + Birthday_day + "</p>");
				} else if (Birthday_day.equals("17")) {
					out.println("<p>Birthday_day:" + Birthday_day + "</p>");
				} else if (Birthday_day.equals("18")) {
					out.println("<p>Birthday_day:" + Birthday_day + "</p>");
				} else if (Birthday_day.equals("19")) {
					out.println("<p>Birthday_day:" + Birthday_day + "</p>");
				} else if (Birthday_day.equals("20")) {
					out.println("<p>Birthday_day:" + Birthday_day + "</p>");
				} else if (Birthday_day.equals("21")) {
					out.println("<p>Birthday_day:" + Birthday_day + "</p>");
				} else if (Birthday_day.equals("22")) {
					out.println("<p>Birthday_day:" + Birthday_day + "</p>");
				} else if (Birthday_day.equals("23")) {
					out.println("<p>Birthday_day:" + Birthday_day + "</p>");
				} else if (Birthday_day.equals("24")) {
					out.println("<p>Birthday_day:" + Birthday_day + "</p>");
				} else if (Birthday_day.equals("25")) {
					out.println("<p>Birthday_day:" + Birthday_day + "</p>");
				} else if (Birthday_day.equals("26")) {
					out.println("<p>Birthday_day:" + Birthday_day + "</p>");
				} else if (Birthday_day.equals("28")) {
					out.println("<p>Birthday_day:" + Birthday_day + "</p>");
				} else if (Birthday_day.equals("29")) {
					out.println("<p>Birthday_day:" + Birthday_day + "</p>");
				} else if (Birthday_day.equals("30")) {
					out.println("<p>Birthday_day:" + Birthday_day + "</p>");
				} else if (Birthday_day.equals("31")) {
					out.println("<p>Birthday_day:" + Birthday_day + "</p>");
				} // 3

				if (Birthday_Month == null) {
					out.println("<p>Birthday_Month: MISSING</p>");
				} else if (Birthday_Month.equals("January")) {
					out.println("<p>Birthday_Month:" + Birthday_Month + "</p>");
				} else if (Birthday_Month.equals("February")) {
					out.println("<p>Birthday_Month:" + Birthday_Month + "</p>");
				} else if (Birthday_Month.equals("March")) {
					out.println("<p>Birthday_Month:" + Birthday_Month + "</p>");
				} else if (Birthday_Month.equals("April")) {
					out.println("<p>Birthday_Month:" + Birthday_Month + "</p>");
				} else if (Birthday_Month.equals("May")) {
					out.println("<p>Birthday_Month:" + Birthday_Month + "</p>");
				} else if (Birthday_Month.equals("June")) {
					out.println("<p>Birthday_Month:" + Birthday_Month + "</p>");
				} else if (Birthday_Month.equals("July")) {
					out.println("<p>Birthday_Month:" + Birthday_Month + "</p>");
				} else if (Birthday_Month.equals("August")) {
					out.println("<p>Birthday_Month:" + Birthday_Month + "</p>");
				} else if (Birthday_Month.equals("September")) {
					out.println("<p>Birthday_Month:" + Birthday_Month + "</p>");
				} else if (Birthday_Month.equals("October")) {
					out.println("<p>Birthday_Month:" + Birthday_Month + "</p>");
				} else if (Birthday_Month.equals("November")) {
					out.println("<p>Birthday_Month:" + Birthday_Month + "</p>");
				} else if (Birthday_Month.equals("December")) {
					out.println("<p>Birthday_Month:" + Birthday_Month + "</p>");
				} // 4

				if (Birthday_Year == null) {
					out.println("<p>Birthday_Year: MISSING</p>");
				} else if (Birthday_Year.equals("2016")) {
					out.println("<p>Birthday_Year:" + Birthday_Year + "</p>");
				} else if (Birthday_Year.equals("2015")) {
					out.println("<p>Birthday_Year:" + Birthday_Year + "</p>");
				} else if (Birthday_Year.equals("2014")) {
					out.println("<p>Birthday_Year:" + Birthday_Year + "</p>");
				} else if (Birthday_Year.equals("2013")) {
					out.println("<p>Birthday_Year:" + Birthday_Year + "</p>");
				} else if (Birthday_Year.equals("2012")) {
					out.println("<p>Birthday_Year:" + Birthday_Year + "</p>");
				} else if (Birthday_Year.equals("2011")) {
					out.println("<p>Birthday_Year:" + Birthday_Year + "</p>");
				} else if (Birthday_Year.equals("2010")) {
					out.println("<p>Birthday_Year:" + Birthday_Year + "</p>");
				} else if (Birthday_Year.equals("2009")) {
					out.println("<p>Birthday_Year:" + Birthday_Year + "</p>");
				} else if (Birthday_Year.equals("2008")) {
					out.println("<p>Birthday_Year:" + Birthday_Year + "</p>");
				} else if (Birthday_Year.equals("2007")) {
					out.println("<p>Birthday_Year:" + Birthday_Year + "</p>");
				} else if (Birthday_Year.equals("2006")) {
					out.println("<p>Birthday_Year:" + Birthday_Year + "</p>");
				} else if (Birthday_Year.equals("2005")) {
					out.println("<p>Birthday_Year:" + Birthday_Year + "</p>");
				} else if (Birthday_Year.equals("2004")) {
					out.println("<p>Birthday_Year:" + Birthday_Year + "</p>");
				} else if (Birthday_Year.equals("2003")) {
					out.println("<p>Birthday_Year:" + Birthday_Year + "</p>");
				} else if (Birthday_Year.equals("2002")) {
					out.println("<p>Birthday_Year:" + Birthday_Year + "</p>");
				} else if (Birthday_Year.equals("2001")) {
					out.println("<p>Birthday_Year:" + Birthday_Year + "</p>");
				} else if (Birthday_Year.equals("2000")) {
					out.println("<p>Birthday_Year:" + Birthday_Year + "</p>");
				} else if (Birthday_Year.equals("1999")) {
					out.println("<p>Birthday_Year:" + Birthday_Year + "</p>");
				} else if (Birthday_Year.equals("1998")) {
					out.println("<p>Birthday_Year:" + Birthday_Year + "</p>");
				} else if (Birthday_Year.equals("1997")) {
					out.println("<p>Birthday_Year:" + Birthday_Year + "</p>");
				} else if (Birthday_Year.equals("1996")) {
					out.println("<p>Birthday_Year:" + Birthday_Year + "</p>");
				} else if (Birthday_Year.equals("1995")) {
					out.println("<p>Birthday_Year:" + Birthday_Year + "</p>");
				} else if (Birthday_Year.equals("1994")) {
					out.println("<p>Birthday_Year:" + Birthday_Year + "</p>");
				} else if (Birthday_Year.equals("1993")) {
					out.println("<p>Birthday_Year:" + Birthday_Year + "</p>");
				} else if (Birthday_Year.equals("1992")) {
					out.println("<p>Birthday_Year:" + Birthday_Year + "</p>");
				} else if (Birthday_Year.equals("1991")) {
					out.println("<p>Birthday_Year:" + Birthday_Year + "</p>");
				} else if (Birthday_Year.equals("1990")) {
					out.println("<p>Birthday_Year:" + Birthday_Year + "</p>");
				} else if (Birthday_Year.equals("1989")) {
					out.println("<p>Birthday_Year:" + Birthday_Year + "</p>");
				} else if (Birthday_Year.equals("1988")) {
					out.println("<p>Birthday_Year:" + Birthday_Year + "</p>");
				} else if (Birthday_Year.equals("1987")) {
					out.println("<p>Birthday_Year:" + Birthday_Year + "</p>");
				} else if (Birthday_Year.equals("1986")) {
					out.println("<p>Birthday_Year:" + Birthday_Year + "</p>");
				} else if (Birthday_Year.equals("1985")) {
					out.println("<p>Birthday_Year:" + Birthday_Year + "</p>");
				} else if (Birthday_Year.equals("1984")) {
					out.println("<p>Birthday_Year:" + Birthday_Year + "</p>");
				} else if (Birthday_Year.equals("1983")) {
					out.println("<p>Birthday_Year:" + Birthday_Year + "</p>");
				} else if (Birthday_Year.equals("1982")) {
					out.println("<p>Birthday_Year:" + Birthday_Year + "</p>");
				} else if (Birthday_Year.equals("1981")) {
					out.println("<p>Birthday_Year:" + Birthday_Year + "</p>");
				} else if (Birthday_Year.equals("1980")) {
					out.println("<p>Birthday_Year:" + Birthday_Year + "</p>");
				} // 5

				if (Email_Id == null) {
					out.println("<p>Email_Id: MISSING</p>");
				} else {
					out.println("<p>Email_Id:" + Email_Id + "</p>");
				} // 6

				if (Mobile_Number == null) {
					out.println("<p>Mobile_Number: MISSING</p>");
				} else {
					out.println("<p>Mobile_Number:" + Mobile_Number + "</p>");
				} // 7

				if (Gender == null) {
					out.println("<p>Gender: MISSING</p>");
				} else if (Gender.equals("Male")) {
					out.println("<p>Gender:" + Gender + "</p>");
				} else {
					out.println("<p>Gender:" + Gender + "</p>");
				} // 8

				if (Address == null) {
					out.println("<p>Address: MISSING</p>");
				} else {
					out.println("<p>Address:" + Address + "</p>");
				} // 9

				if (City == null) {
					out.println("<p>City: MISSING</p>");
				} else {
					out.println("<p>City:" + City + "</p>");
				} // 10

				if (Pin_Code == null) {
					out.println("<p>Pin_Code: MISSING</p>");
				} else {
					out.println("<p>Pin_Code:" + Pin_Code + "</p>");
				} // 11

				if (State == null) {
					out.println("<p>State: MISSING</p>");
				} else {
					out.println("<p>State:" + State + "</p>");
				} // 12

				if (Country == null) {
					out.println("<p>Country: MISSING</p>");
				} else {
					out.println("<p>Country:" + Country + "</p>");
				} // 13

				if (Hobby == null || Hobby.length == 0) {
					out.println("<p>Hobby: MISSING</p>");
				} else {
					for (String cl : Hobby) {
						if (cl.equals("Drawing")) {
							out.println("<p>Hobby:" + cl + "</p>");
						} else if (cl.equals("Singing")) {
							out.println("<p>Hobby:" + cl + "</p>");
						} else if (cl.equals("Dancing")) {
							out.println("<p>Hobby:" + cl + "</p>");
						} else {
							out.println("<p>Hobby:" + cl + "</p>");
						}
					}

				} // 14

				if (ClassVII_Board == null) {
					out.println("<p>ClassVII_Board: MISSING</p>");
				} else {
					out.println("<p>ClassVII_Board:" + ClassVII_Board + "</p>");
				} // 15

				if (ClassVII_Percentage == null) {
					out.println("<p>ClassVII_Percentage: MISSING</p>");
				} else {
					out.println("<p>ClassVII_Percentage:" + ClassVII_Percentage + "</p>");
				} // 16

				if (ClassVII_YrOfPassing == null) {
					out.println("<p>ClassVII_YrOfPassing: MISSING</p>");
				} else {
					out.println("<p>ClassVII_YrOfPassing:" + ClassVII_YrOfPassing + "</p>");
				} // 17

				if (Course == null) {
					out.println("<p>Course: MISSING</p>");
				} else if (Course.equals("eight")) {
					out.println("<p>Course:" + Course + "</p>");
				} else if (Course.equals("nine")) {
					out.println("<p>Course:" + Course + "</p>");
				} else {
					out.println("<p>Course:" + Course + "</p>");
				} // 18
				
				out.println("<a href='admision.html'>BACK</a></br></br>");

			} else {
				out.println("<html><body><centre>");
				out.println("<li><i>");
				out.println("Given details are not valid to register</i></li></br>");
				out.println("<li><i>Please try again later</i></li>");
				out.println("</centre></body></html>");
				return;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			out.close();
		}

	}

}
