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
@WebServlet("/login100")
public class LoginTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");		
		PrintWriter out=response.getWriter();	
		
		String user_id=request.getParameter("user_id");
		String user_pw=request.getParameter("user_pw");
		
		out.println("<html><body>");
		out.println("이름은"+user_id+"<br>");
		out.println("비밀번호는"+user_pw+"<br>");
		out.println("<html><body>");
		out.println("</body></html>");
	}

}

	


