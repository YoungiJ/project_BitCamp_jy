<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<%--선언부 --%>
<% 
	String name=(String)request.getAttribute("name");
	String address=(String)request.getAttribute("address");

%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> request1.jsp의 request를 받아서 get하고 rendering 하기</title>
</head>
<body>
	<!-- 실행부 -->
	이름 -> <%=name %> 이에여 !<br>
	주소-> <%=address %> 이에여 !<br>
</body>
</html>