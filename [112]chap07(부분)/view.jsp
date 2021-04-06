<%@ page contentType="text/html;charset=utf-8"%>
<%
	String code = request.getParameter("code");
	String viewPageURI = null;

	if(code.equals("A")){
		viewPageURI="/viewModule/a.jsp";
	}else if(code.equals("B")){
		viewPageURI="/viewModuel/b.jsp";
	}else if(code.equals("C")){
		viewPageURI="/viewModuel/c.jsp";
	}
%>
<jsp:forward page="<%=viewPageURI%>"/>