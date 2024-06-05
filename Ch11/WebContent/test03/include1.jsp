<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="addException.jsp"%>


<%--선언부 --%>
<% 
	request.setCharacterEncoding("UTF-8");
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> include1.jsp</title>
</head>
<body>
		<!-- 실행부 -->
<br> 안녕하세요 쇼핑몰 시작이야
	<!-- include 태그를 통해 아까와  다르게 컴파일 된 class를 call해서 사용  -->
	<jsp:include page="duke_image.jsp" flush="true">
		<jsp:param name="name" value="duke"/>
		<jsp:param name="imgname" value="duke.png"/>
	</jsp:include>
	
<br> 안녕하세요 쇼핑몰 끝이야
</body>
</html>