<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<%--선언부 --%>
<% 
	String name=(String)session.getAttribute("name"); 
	String address=(String)session.getAttribute("address"); 

%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>session 내장 객체 테스트2</title>
</head>
<body>
	<!-- 실행부 -->
	이름 -> <%=name %> 이에여 !<br>
	주소-> <%=address %> 이에여 !<br>

</body>
</html>