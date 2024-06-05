package sec02.ex05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(name="initParamServlet",urlPatterns= {"/sInit","/sInit2"},initParams= {
		@WebInitParam(name="email",value="010-2413*3206")})

public class initParamServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();

		
		String email=getInitParameter("email");
		String tel=getInitParameter("tel");
		
		out.print("<html><body>");
		out.print("<table><tr>");
		out.print("<td>email:</td><td>"+email+"</td></tr>");
		out.print("<tr><td>휴대전화e:</td><td>"+tel+"</td>");	
		out.print("</tr></table></body></html>");
	
	}



}
