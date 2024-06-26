<%@page import="LoginProgram2src.MemberDAO"%>
<%@page import="LoginProgram2src.MemberBean"%>
<%@page import="java.util.*"%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%-- 선언부 --%>
<%
    request.setCharacterEncoding("UTF-8");

    // form 태그로 제출한 데이터를 getParameter로 받음
    String id = request.getParameter("id");
    String pwd = request.getParameter("pwd");
    String name = request.getParameter("name");
    String email = request.getParameter("email");

    MemberBean m = new MemberBean(id, pwd, name, email);
    MemberDAO dao = new MemberDAO();
    dao.addMember(m);

    List<MemberBean> memberList = dao.ListMembers();
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>회원 목록 창</title>
</head>

<body>
    <table align="center" width="100%">
        <tr align="center" bgcolor="#99ccff">
            <td width="7%">아이디</td>
            <td width="7%">비밀번호</td>
            <td width="5%">이름</td>
            <td width="11%">이메일</td>
            <td width="5%">가입일</td>
        </tr>
        <% if (memberList.size() == 0) { %>
        <!-- 객체에서 데이터 가져오기 -->
        <tr>
            <!-- table head 부분이라 병합하기 -->
            <td colspan="5">
                <p align="center"><b>
                <span style="font-size:9pt;">
                    등록된 회원이 없습니다.
                </span></b></p>
            </td>
        </tr>
        <% } else { %>
            <% for (int i = 0; i < memberList.size(); i++) {
                // list에서 객체 가져오기
                MemberBean bean = memberList.get(i);
            %>
            <tr align="center">
                <td><%= bean.getId() %></td>
                <td><%= bean.getPwd() %></td>
                <td><%= bean.getName() %></td>
                <td><%= bean.getEmail() %></td>
                <td><%= bean.getJoinDate() %></td>
            </tr>
            <% } %>
        <% } %>
    </table>
</body>
</html>
