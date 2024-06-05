package sec01.ex02;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
//@WebServlet("/sess")
public class SessionTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		
		//최초 요청했으면 세션 객체 새로 생성, 아니면 기존 세션 반환
		HttpSession session=request.getSession();
		// 가져온 세션의 id를 반환
		out.println("세션 아이디"+session.getId()+"<br>");
		// 최초 세션 객체 생성 시간을 가져옴
		out.println("최초 세션 생성 시각"+new Date(session.getCreationTime())+"<br>");
		// 가장 최근에 접근한 시간을 가져옴
		out.println("최근 세션 접근 시각"+new Date(session.getLastAccessedTime())+"<br>");
		//객체의 유효 시간 max inactive interval ( 비활동 간격)
		out.println("세션 유효 시간"+session.getMaxInactiveInterval()+"<br>");
		// 세션의 유효 시간을 5초로 설정한다
		session.setMaxInactiveInterval(5);
		out.println("세션 유효 시간:"+session.getMaxInactiveInterval()+"<br>");
		//최초 생성된 세션인지 판별
		if(session.isNew()) {
			out.println("새 세션이 만들어졌습니당");
		}
	
		// 생성된 세션 객체를 강제로 삭제
		session.invalidate();
	}

	

}
