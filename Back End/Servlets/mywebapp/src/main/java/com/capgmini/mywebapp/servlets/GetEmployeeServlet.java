package com.capgmini.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetEmployeeServlet  extends HttpServlet
{
	
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String idVal=req.getParameter("id");
	
	resp.setContentType("text/html");
	
	
	PrintWriter out=resp.getWriter();//creating reference to print 
	
	out.print("<html>");
	out.print("<body style=background-color:red>");
	out.print("Employee id="+idVal);
	out.print("<br>Name=sunil");
	out.print("<br>salary=12345");
	out.print("</body>");
	out.print("</html>");
	
}
}
