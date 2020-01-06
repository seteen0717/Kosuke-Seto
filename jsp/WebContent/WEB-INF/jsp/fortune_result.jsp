<%@ page import="task3.FortuneBean" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<% FortuneBean fortuneBean2 = (FortuneBean)request.getAttribute("FORTUNE"); %>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	if(fortuneBean2 != null) {
		out.println("<h1>↓" + fortuneBean2.getToday() + "↓</h1>");
		out.println("<h1>" + fortuneBean2.getFortune() + "</h1>");
	}
%>
</body>
</html>