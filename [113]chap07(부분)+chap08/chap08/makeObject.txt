<%@ page contentType="text/html;charset=utf-8"%>
<jsp:useBean id="member" scope="request" class="chap08.member.MemberInfo"/>
<%
	member.setId("a");
	member.setName("b");
%>
<jsp:forward page="/useObject.jsp"/>