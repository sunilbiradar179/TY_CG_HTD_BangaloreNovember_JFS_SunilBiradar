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

@WebServlet("/login")
public class LoginServlet extends HttpServlet
{
	private EmployeeService service=new EmployeeServiceImpl();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//get the form data
		String empIdVal=req.getParameter("empId");
		String password=req.getParameter("password");
		
		int empId=Integer.parseInt(empIdVal);
		
		EmployeeInfoBean employeeInfoBean= service.authenticate(empId, password);
		
		
		PrintWriter out=resp.getWriter();
		
		out.print("<html>");
		out.print("<body>");
		if(employeeInfoBean!=null)
		{
			//if valid information create session
			HttpSession session=req.getSession(true);
			session.setAttribute("employeeInfoBean", employeeInfoBean);//passing object through attribute
			
			
			out.print("<h2>Welcome"+employeeInfoBean.getName()+"</h2>");
			out.print("<br><a href='./addEmpForm.html'>Add Employee</a>");
			out.print("<br><a href='#'>Update Employee</a>");
			out.print("<br><a href='./searchEmpForm.html'>Search Employee</a>");
			out.print("<br><a href='./deleteEmpForm.html'>Delete Employee</a>");
			out.print("<br><a href='#'>Display All Employee</a>");
			out.print("<br><a href='./logout'>Logout</a>");
			
		}
		else
		{
			//invalid information
			
			out.print("<h3 style='color:red'>Invalid Credentials<h3>");
			req.getRequestDispatcher("./loginPage.html").include(req, resp);
		}
		out.print("</html>");
		out.print("</body>");
	}

}
