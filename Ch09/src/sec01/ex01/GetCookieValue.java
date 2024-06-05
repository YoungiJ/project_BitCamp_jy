package sec01.ex01;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
//@WebServlet("/gett")
public class GetCookieValue extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		////사용자의 쿠키 정보를(유효기간, 디렉터리 정보, 설정감, 유효 도메인) 받아서 저장함
		Cookie[] allValuesCookies=request.getCookies();
		
		for(int i=0;i<allValuesCookies.length;i++) {
			if(allValuesCookies[i].getName().equals("cookieTest")) {
				//쿠키값을 가져옴-> 브라우저가 숨겨온 데이터를 서버가 찾기
				// encoding을 했으니 당연히 decoding도 해야함
					System.out.println(allValuesCookies[i].getValue());
					out.println("<h2>Cookie값 가져오기"+URLDecoder.decode(allValuesCookies[i].getValue(),"utf-8"));
			
			
			}
			
		}
	
	
	
	}

	

}
