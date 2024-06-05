package sec02.ex03;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
//@WebServlet("/cget")
public class GetServletContext extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		
		// context 정보 공유하기 위해서 
		ServletContext context=getServletContext();
		//정보 공유 context에서   member 속성을 가져와서 리스트에 넣음
		List member=(ArrayList)context.getAttribute("member");
		//list에서 첫번쨰 정보를 꺼냄
		String name=(String)member.get(0);
		int age=(Integer)member.get(1);
		
		out.print("<html><body>");
		out.print(name+"<br>");
		out.print(age+"<br>");
		out.print("</body></html>");

	}
	

}
