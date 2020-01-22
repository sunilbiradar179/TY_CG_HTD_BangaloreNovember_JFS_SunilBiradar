package com.capgemini.mywebapp.servletsforjsp;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capgmini.mywebapp.beans.EmployeeInfoBean;
import com.capgmini.mywebapp.service.EmployeeService;
import com.capgmini.mywebapp.service.EmployeeServiceImpl;
@WebServlet("/login2")
public class LoginServlet extends HttpServlet
{
	private EmployeeService service=new EmployeeServiceImpl();
		
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int empId=Integer.parseInt(req.getParameter("empId"));
		String password=req.getParameter("password");
		
		
		EmployeeInfoBean employeeInfoBean=service.authenticate(empId, password);
		
		
		if(employeeInfoBean!=null)
		{
			//valid credentials
			HttpSession session=req.getSession(true);
			session.setAttribute("employeeInfoBean", employeeInfoBean);
			session.setMaxInactiveInterval(60);//this is for setting the interval time if any request has not made
			
			
			req.getRequestDispatcher("./homePageJsp.jsp").forward(req, resp);
		}
		else
		{
			//invalid credentials
			
			req.setAttribute("msg", "Invalid credentials.....");
			
			req.getRequestDispatcher("./loginForm").forward(req, resp);
		}
	}

}