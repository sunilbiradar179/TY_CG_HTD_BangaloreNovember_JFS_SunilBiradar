package com.capgmini.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet 
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession(false);

		
		if(session!=null)
		{
			session.invalidate();
			PrintWriter out=resp.getWriter();
			out.print("text/html");
			out.print("<html>");
			out.print("<body>");

			out.print("<h3 style='color:red'>You Are Successfully Logged Out<h3>");
			out.print("</html>");
			out.print("</body>");

		}
		else
		{PrintWriter out=resp.getWriter();
		out.print("text/html");
		out.print("<html>");
		out.print("<body>");

			out.print("<h3 style='color:red'>You Are Already Logged Out<h3>");
			out.print("</html>");
			out.print("</body>");
		}
		

		req.getRequestDispatcher("./loginPage.html").include(req, resp);

	}

}
