package com.douglas254;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

		int k = Integer.parseInt(req.getParameter("k"));
		
		// calculate square of a number
		k = k * k;

		// print out the result to the browser
		PrintWriter out = res.getWriter();
		out.println("Result is = " + k);
	}
}
