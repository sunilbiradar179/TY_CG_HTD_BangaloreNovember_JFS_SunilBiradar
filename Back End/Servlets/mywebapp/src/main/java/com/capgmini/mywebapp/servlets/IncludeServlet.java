package com.capgmini.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/include")
public class IncludeServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String url="./currentDate";
		
		
		//we are including HELLO WORLD in currentDate page
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("<h2> hello world</h2>");
				
		RequestDispatcher dispatcher=req.getRequestDispatcher(url);
		dispatcher.include(req, resp);
		
		//we are including THANK YOU at the bottom
		out.print("<h2> Thank you</h2>");
		out.print("</body>");
		out.print("<html>");

	}

}
