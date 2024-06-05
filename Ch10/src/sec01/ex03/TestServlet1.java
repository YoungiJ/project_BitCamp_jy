package sec01.ex03;

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

import sec01.ex04.LoginImpl;

/**
이름까지 똑같은 경우 (가장 세부적)
 */
@WebServlet("/first/test")
public class TestServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		

		//context이름만 가지고 옴 -> 하나의 application당 하나의 context가 존재하며 web.xml에 정의되어 있더
		String context=request.getContextPath();
		//어디서 url을 가져와...?
		String url=request.getRequestURL().toString();
		
		String mapping=request.getServletPath();
		//어디서 url을 가져와...?
		String uri=request.getRequestURI();
		
	    

        out.println("<html><body bgcolor='green'>");
        out.println("<b>testservlet1</b><br>");
        out.println("</body></html>");
//		

		
	}
	
	

	

}
