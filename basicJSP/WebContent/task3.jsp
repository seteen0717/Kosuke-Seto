<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.Date"  import="java.text.SimpleDateFormat"
%>
<!DOCTYPE html>
<html>
<head>
<%!
Date now = new Date();
SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
int count = 0;
%>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>訪問回数：<%= count++ %></h1>
<p>今日の日付：<%= sdf.format(now) %></p>
</body>
</html>