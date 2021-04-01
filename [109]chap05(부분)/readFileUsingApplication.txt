<%@ page contentType="text/html;charset=utf-8"%>
<%@ page import = "java.io.*"%>
<html>
<head><title>절대 경로 사용하여 자원 읽기</title></head>
<body>
<%
	String resourcePath = "\\message\\notice.txt";
%>
자원의 실제 경로:<br>
<%=application.getRealPath(resourcePath)%>
<br>
--------------<br>
<%= resourcePath%>의 내용<br>
--------------<br>
<%
	char[] buff = new char[128];
	int len = -1;

	String filePath="C:\\apache-tomcat-8.5.63\\webapps\\chap05\\message\\notice.txt";
	try{
		InputStreamReader fr= new InputStreamReader(application.getResourceAsStream(resourcePath),"UTF-8");
		while((len=fr.read(buff))!=-1){
			out.print(new String(buff,0,len));
		}
	}catch(IOException ex){
		out.println("익셉션 발생: "+ex.getMessage());
	}
%>
</body>
</html>