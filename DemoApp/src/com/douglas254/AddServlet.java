package com.douglas254;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
	// we can use the doGet or doPost method in place of the service method
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		// get inputs from the client form and store in a variable
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));

		// add variable i and j
		int k = i + j;

		// setting the value of k so that it can be fetched from the SqServlet
		req.setAttribute("k", k);

		// two ways of calling a servlet
		// 1. RequestDispatcher
		// 2. sendRedirect

		// using RequestDispatcher to call SqServlet
		RequestDispatcher rd = req.getRequestDispatcher("Sq");
		rd.forward(req, res);
	}
}
