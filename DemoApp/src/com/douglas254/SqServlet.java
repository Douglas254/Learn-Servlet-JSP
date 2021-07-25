package com.douglas254;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		// fetching the value of k from the AddServlet and cast it to an integer because
		// it return object of an object
		int k = (int) req.getAttribute("k");

		// calculate square of a number
		k = k * k;

		// print out the result to the browser
		PrintWriter out = res.getWriter();
		out.println("Result is = " + k);
	}
}
