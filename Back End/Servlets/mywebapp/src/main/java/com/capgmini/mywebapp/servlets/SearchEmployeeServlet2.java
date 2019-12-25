package com.capgmini.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capgmini.mywebapp.beans.EmployeeInfoBean;
import com.capgmini.mywebapp.service.EmployeeService;
import com.capgmini.mywebapp.service.EmployeeServiceImpl;

@WebServlet("/searchEmployee2")
public class SearchEmployeeServlet2 extends HttpServlet //for validating the session
{
	private EmployeeService service=new EmployeeServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//getting the session...false wiil return if session is running otherwise return null
		HttpSession session=req.getSession(false);
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.print("<html>");
		out.print("<body>");
		if (session!=null) 
		{
			//valid session
			
			//Get the form data

			String empIdVal=req.getParameter("empid");

			int empId=Integer.parseInt(empIdVal);
			EmployeeInfoBean ebean=service.searchEmployee(empId);


			
			if(ebean!=null)
			{
				out.print("<h3>Employee Id"+empId +"Found</h3>");
				out.print("Name="+ebean.getName());
				out.print("<br>Age="+ebean.getAge());
				out.print("<br>Salary="+ebean.getSalary());
				out.print("<br>Designation="+ebean.getDesignation());

			}
			else
			{
				out.print("<h3> Employee Id"+empId+"not found <h3>");
			}
			
			
		}
		else
		{
			//invalid session
			
			out.print("Please login First");
			
			req.getRequestDispatcher("./loginPage.html").include(req, resp);
		}
	}

}
