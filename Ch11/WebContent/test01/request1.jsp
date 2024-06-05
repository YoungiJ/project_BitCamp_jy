<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<%--선언부 --%>
<% 
	request.setAttribute("name","징영");
	request.setAttribute("address","용인시"); 


%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> request를 받아서 dispatcher를 통해 넘기기</title>
</head>
<body>
	<% 
		RequestDispatcher dispatcher=request.getRequestDispatcher("request2.jsp");
		dispatcher.forward(request,response);
	
	%>
</body>
</html>