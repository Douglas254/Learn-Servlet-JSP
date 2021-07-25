package com.douglas254;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SqServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

		HttpSession session = req.getSession();
		int k = (int) session.getAttribute("k");
		
		// calculate square of a number
		k = k * k;

		// print out the result to the browser
		PrintWriter out = res.getWriter();
		out.println("Result is = " + k);
	}
}
