package com.douglas254;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet extends HttpServlet {
	// we can use the doGet or doPost method in place of the service method
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		// get inputs from the client form and store in a variable
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));

		// add variable i and j
		int k = i + j;

		// using cookie
		Cookie cookie = new Cookie("k", k + "");
		res.addCookie(cookie);
		
		// call SqServlet
		res.sendRedirect("Sq");
	}
}
