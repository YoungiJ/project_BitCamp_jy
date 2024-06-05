package sec01.ex01;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.sql.Date;

import javax.servlet.ServletContext;
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
//@WebServlet("/get")
public class GetAttribute2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		

		
		// context 생성
		ServletContext ctx=getServletContext();
		// session 생성
		HttpSession session=request.getSession();
		
		//각 서블릿api에서 바인딩된 속성값을 가져옴
		String ctxMesg=(String)ctx.getAttribute("ctx");
		String sesMesg=(String)session.getAttribute("session");
		//request
		String reqMesg=(String)request.getAttribute("request");
		
//		ctx.setAttribute("context",ctxMesg);
//		session.setAttribute("session", sesMesg);
//		request.setAttribute("request", reqMesg);
//		
		out.println("context 값:"+ctxMesg+"<br>");
		out.println("session 값:"+sesMesg+"<br>");
		out.println("request 값:"+reqMesg+"<br>");
		
	}
	
	

	

}
