package sec01.ex03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
//@WebServlet("/first")
public class FirstServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		//앞에는 서블릿 이름? 뒤에는 전달할 변수
		response.sendRedirect("second?name=lee");
				
	
	}
	

}
