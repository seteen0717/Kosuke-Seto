<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%! int subst(int a, int b){
	return a - b;
   }
%>

<meta charset="UTF-8">
<title>JSP TSK</title>
</head>
<body>
<h1>125 - 15 = <%= subst(125, 15) %></h1>
<h1>17 - 21 = <%= subst(17, 21) %></h1>
</body>
</html>