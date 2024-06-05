<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<%--선언부 --%>
<% String name=(String)session.getAttribute("name");
	session.setAttribute("address","용인시"); 


%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>session 내장 객체 테스트</title>
</head>
<body>
	<!-- 실행부 -->
	이름 -> <%=name %> 이에여 !<br>

	<a href=/Ch11/session2.jsp>두번째 페이지로 이동</a>
</body>
</html>