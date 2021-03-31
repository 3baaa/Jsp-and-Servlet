<%@ page contentType="text/html;charset=utf-8"%>
<%@ page import = "java.net.URLEncoder"%>
<%
	response.sendRedirect("/chap03/index.jsp?name="+request.getParameter("name"));
%>
<html>
<head><title></title></head>
<body>
</body>
</html>