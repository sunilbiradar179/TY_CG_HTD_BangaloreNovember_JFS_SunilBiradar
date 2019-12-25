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

import antlr.collections.List;
@WebServlet("/seeAllEmployees")
public class SeeAllEmployeesServlet extends HttpServlet{
	private EmployeeService service=new EmployeeServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession(false);

		if(session!=null)
		{
			//valid session
			java.util.List<EmployeeInfoBean> list=service.getAllEmployees();
			if (list!=null && !list.isEmpty())
			{
				req.setAttribute("EmployeesList", list);


			}
			else
			{
				req.setAttribute("msg", "There is no Employees to Display");

			}
			req.getRequestDispatcher("./seeAllEmployeesJsp.jsp").forward(req, resp);
		}
		else
		{
			//invalid session
			req.setAttribute("msg", "Please login First");
			req.getRequestDispatcher("./loginForm").forward(req, resp);
		}
	}

}
