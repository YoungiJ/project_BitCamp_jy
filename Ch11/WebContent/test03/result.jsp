<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
  <% 
	request.setCharacterEncoding("UTF-8");
%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>duke image</title>
</head>
<body>
	<% 
	String userID=request.getParameter("userID");
	if(userID.length()==0){
	%>
	<jsp:forward page="login.jsp"/>
	<%
	}
	%>
	<h1>환영 <%=userID %>님!!</h1>
</body>
</html>