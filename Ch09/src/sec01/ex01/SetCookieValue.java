package sec01.ex01;

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

/**
 * Servlet implementation class LoginServlet
 */
//@WebServlet("/sett")
public class SetCookieValue extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		
		Date d=new Date(0);
		// 이름이 쿠키 테스트인 객체 생성-> text를 인코딩에서 쿠키에 저장함
		Cookie cookie=new Cookie("cookieTest", URLEncoder.encode("jsp 프로그래밍입니다","utf-8"));
		//유효시간을 설정
//		cookie.setMaxAge(24*60*60);
		// persistance가 아니라  session 쿠키가 만들어짐!!
		cookie.setMaxAge(-1);
		//생성된 쿠키를 브라우저에 찐으로 전송!!!
		response.addCookie(cookie);
		out.println("현재시간"+d);
		out.println("<br>문자열을 cookie에 저장합니다.");
		
	}


}
