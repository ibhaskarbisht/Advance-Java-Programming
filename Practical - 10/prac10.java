package com.bhaskar;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/prac10")
public class prac10 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
	ServletException, IOException {
	response.setIntHeader("Refresh",1);
	response.setContentType("text/html");
	Calendar calendar=new GregorianCalendar();
	int hour=calendar.get(Calendar.HOUR);
	int minute=calendar.get(Calendar.MINUTE);
	int second=calendar.get(Calendar.SECOND);
	String am_pm;
	if(calendar.get(Calendar.AM_PM)==0)
	am_pm="AM";
	else
	am_pm="PM";
	PrintWriter out=response.getWriter();
	out.println("<br>Heading: " +
	getServletContext().getInitParameter("headingOfTheProject"));
	out.println("<br>Address:" + getInitParameter("address"));
	out.println("<br><br><br>Auto Refresh Page<br>");
	out.println("Current time: "+ hour + ":" + minute + ":" + second + " " + am_pm);

	}

}
