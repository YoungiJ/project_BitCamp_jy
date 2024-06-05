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
//@WebServlet("/set")
public class SetAttribute2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		
		String ctxMesg="context에 바인딩됩니다.";
		String sesMesg="session에 바인딩됩니다.";
		String reqMesg="request에 바인딩됩니다.";
		
		// context 생성
		ServletContext ctx=getServletContext();
		// session 생성
		HttpSession session=request.getSession();
		
		
		ctx.setAttribute("context",ctxMesg);
		session.setAttribute("session", sesMesg);
		request.setAttribute("request", reqMesg);
		
		out.println("바인딩을 수행합니다.");
		
	}
	
	

	

}
