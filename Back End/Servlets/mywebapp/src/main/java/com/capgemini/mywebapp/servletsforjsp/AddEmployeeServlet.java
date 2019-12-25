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
@WebServlet("/addEmployee2")
public class AddEmployeeServlet extends HttpServlet{
	private EmployeeService service=new EmployeeServiceImpl();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
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
			
			if(service.addEmployee(employeeInfoBean))
			{
				req.setAttribute("msg", "Employee Added Successessfully..");
				req.getRequestDispatcher("./addEmpForm.jsp").forward(req, resp);
			}
			
		}
		else
		{
			//invalid session
			req.setAttribute("msg", "Please Login First");
			req.getRequestDispatcher("./loginForm").forward(req, resp);
		}
		
	}

}
