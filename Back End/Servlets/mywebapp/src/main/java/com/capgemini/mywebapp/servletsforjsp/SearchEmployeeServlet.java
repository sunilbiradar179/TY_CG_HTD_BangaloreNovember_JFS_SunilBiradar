package com.capgemini.mywebapp.servletsforjsp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capgmini.mywebapp.beans.EmployeeInfoBean;
import com.capgmini.mywebapp.service.EmployeeService;
import com.capgmini.mywebapp.service.EmployeeServiceImpl;

@WebServlet("/searchEmployee3")
public class SearchEmployeeServlet extends HttpServlet
{
	private EmployeeService service=new EmployeeServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession(false);
		
		if(session!=null)
		{
			//valid session
			//get the form data
			int empId=Integer.parseInt(req.getParameter("empid"));
			
			EmployeeInfoBean employeeInfoBean=service.searchEmployee(empId);
			
			req.setAttribute("employeeInfoBean", employeeInfoBean);
			req.getRequestDispatcher("./searchEmpJsp.jsp").forward(req, resp);
			
		}
		else
		{
			//invalid session
			req.setAttribute("msg", "Please Login First");
			req.getRequestDispatcher("./loginForm").forward(req, resp);
		}
	}

}
