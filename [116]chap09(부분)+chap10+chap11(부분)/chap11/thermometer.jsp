<%@ page contentType="text/html;charset=utf-8"%>
<%@ page import="chap11.Thermometer"%>
<%
	Thermometer thermometer = new Thermometer();
	request.setAttribute("t",thermometer);
%>
<html>
<head><title>온도 변환 예제</title></head>
<body>

	${t.setCelsius('seoul',27.3)}
	서울 온도: 섭씨 ${t.getCelsius('seoul')}도 / 화씨 ${t.getFahrenheit('seoul')}
	
	<br>
	정보: ${t.info}
</body>
</html>