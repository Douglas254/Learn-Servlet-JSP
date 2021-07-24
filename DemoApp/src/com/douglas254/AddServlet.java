package com.douglas254;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		// get inputs from the client form and store in a variable
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));

		// add variable i and j
		int k = i + j;

		// print out on the browser
		PrintWriter out = res.getWriter();
		out.println("Result is = " + k);
	}
}
