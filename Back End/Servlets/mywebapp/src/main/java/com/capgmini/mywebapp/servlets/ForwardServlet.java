package com.capgmini.mywebapp.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/forward")
public class ForwardServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String url="./currentDate";//giving the internal resource url
		RequestDispatcher dispatcher=req.getRequestDispatcher(url);//creating reference of RequestDispatche and passing url to method
		dispatcher.forward(req, resp);//forwarding the request
	}

}