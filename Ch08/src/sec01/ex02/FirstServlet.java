package sec01.ex02;

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
		//http 응답 헤더를 수정해서 refresh 헤더추가=> 이동하라고 지시
		//대기 시간이 지난 후 이동할 URL을 지정
		response.addHeader("Refresh","1;url=second");
				
	
	}
	

}
