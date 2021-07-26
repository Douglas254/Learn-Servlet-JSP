<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>use of pageContext ~ implicit object in JSP</title>
</head>
<body>

	<%
		/* we use pageContext.SESSION_SCOPE for it to be reffered on other pages i.e different scopes */
		pageContext.setAttribute("name", "Douglas", pageContext.SESSION_SCOPE);
	%>

</body>
</html>