<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP ~ Java Server Pages</title>
</head>
<body bgcolor="cyan">

	<!-- use scriptlet tags to inject in the service() method -->
	<%
		int a = Integer.parseInt(request.getParameter("num1"));
		int b = Integer.parseInt(request.getParameter("num2"));

		int result = a + b;
		out.print("Output : " + result);
	%>

</body>
</html>