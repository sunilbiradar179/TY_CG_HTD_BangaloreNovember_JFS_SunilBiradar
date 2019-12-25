package com.capgmini.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgmini.mywebapp.beans.EmployeeInfoBean;
import com.capgmini.mywebapp.service.EmployeeService;
import com.capgmini.mywebapp.service.EmployeeServiceImpl;
@WebServlet("/searchEmployee")
public class SearchEmployeeServlet extends HttpServlet
{

	private EmployeeService service=new EmployeeServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


		//Get the form data

		String empIdVal=req.getParameter("empid");

		int empId=Integer.parseInt(empIdVal);
		EmployeeInfoBean ebean=service.searchEmployee(empId);


		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.print("<html>");
		out.print("<body>");
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
		out.print("</html>");
		out.print("</body>");
	}

}
