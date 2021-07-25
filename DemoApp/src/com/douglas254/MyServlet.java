package com.douglas254;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		out.print("Hi ");

		// getting the name of web.xml context-param value using ServletContext
		// servletContext is good if you have multiple servlets which will share the same value
		ServletContext ctx = getServletContext();

		// fetch servlet context object
		String str = ctx.getInitParameter("name");

		out.println(str);

	}
}
