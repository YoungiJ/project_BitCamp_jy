
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.sql.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//@WebServlet("/sess")
public class SessionTest extends HttpServlet{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		
		
		// session 생성
		HttpSession session=request.getSession();
		session.setAttribute("name", "지영");
		
		//각 서블릿api에서 바인딩된 속성값을 가져옴
		out.println("<html><body>");
		out.println("<h1> 세션에 이름을 바인딩 </h1>");
		out.println("<a href='/Ch11/session1.jsp'>첫번째 페이지로 이동하기</a>");
		out.println("</body></html>");
		
	

}}
