package sec01.ex03;

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

import sec01.ex04.LoginImpl;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login10")
public class LoginTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");		
		PrintWriter out=response.getWriter();	
		
		String user_id=request.getParameter("user_id");
		String user_pw=request.getParameter("user_pw");
		
	      out.println("<head>");
	        out.println("<script type='text/javascript'>");
	        out.println("</script>");
	        out.println("</head>");

	      
	}

}

	


