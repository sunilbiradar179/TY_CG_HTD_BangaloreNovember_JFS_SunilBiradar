package com.capgmini.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DateServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Date date=new Date();//this is for urrent system date.....create object of date interface of java.util package
		
		//get the context param
		ServletContext context=getServletContext();
		String contextParamVal=context.getInitParameter("myContextParam");
		
		//get config param
		ServletConfig config=getServletConfig();
		String configParamVal=config.getInitParameter("myConfigParam");
		
		
		
		resp.setContentType("text/html");
		resp.setHeader("refresh", "1");
		PrintWriter out=resp.getWriter();
		out.print("<html>");
		out.print("<h2>Current System date and time-"+date+"</h2>");
		out.print("<br> Context param value="+contextParamVal);
		
		out.print("<br> Config param value="+configParamVal);
		out.print("</html>");
	}

}
