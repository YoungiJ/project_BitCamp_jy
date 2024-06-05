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
//@WebServlet("/cset")
public class SetServletContext extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//설정을 함-> add
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		
		//그 환경을 가져옴
		ServletContext context=getServletContext();
		// list 객체에 정보를 넣고
		List member=new ArrayList();
		member.add("이순신");
		member.add(30);
		// 환경에 멤버 객체를 name,value식으로 setting을 해놓음
		context.setAttribute("member", member);
		
		out.println("<html><body>");
		out.println("이순신과 30을 설정");
		out.println("</body></html>");
		
	}
	

}
