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

@WebServlet("/addEmployee")
public class AddEmployeeServlet extends HttpServlet
{
	private EmployeeService service=new EmployeeServiceImpl();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		
		
		HttpSession session=req.getSession(false);
		
		if(session!=null)
		{
			//valid session
			
			int empId=Integer.parseInt(req.getParameter("empId"));
			
			String name=req.getParameter("name");
			int age=Integer.parseInt(req.getParameter("age"));
			double salary=Double.parseDouble(req.getParameter("salary"));
			String designation=req.getParameter("designation");
			String password=req.getParameter("password");
			
			EmployeeInfoBean employeeInfoBean=new EmployeeInfoBean();
			employeeInfoBean.setEmpId(empId);
			employeeInfoBean.setName(name);;
			employeeInfoBean.setAge(age);
			employeeInfoBean.setSalary(salary);
			employeeInfoBean.setDesignation(designation);
			employeeInfoBean.setPassword(password);
			
			//to add values through employeeInfoBean
			boolean isAdded=service.addEmployee(employeeInfoBean);
			
			PrintWriter out=resp.getWriter();
			out.print("<html>");
			out.print("<body>");
			if(isAdded)
			{
				out.print("<h3>Employee added Successfully.....</h3>");
			}
			
			else
			{
				out.print("<h3>Unable to add Employee.....</h3>");
			}
			out.print("</html>");
			out.print("</body>");
			
			req.getRequestDispatcher("./addEmpForm.html").include(req, resp);
			
			
		}
		else
		{
			//invalid session
			PrintWriter out=resp.getWriter();
			out.print("<html>");
			out.print("<body>");
			out.print("<h3>Please Login First....</h3>");
			out.print("</html>");
			out.print("</body>");
			req.getRequestDispatcher("./loginPage.html").include(req, resp);
			
		}
		
	}

}
