package sec02.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/first")
public class FirstServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		
		request.setAttribute("name", "지영");
//		RequestDispatcher dispatcher=request.getRequestDispatcher("second?name=hwang");
		RequestDispatcher dispatcher=request.getRequestDispatcher("second");
		dispatcher.forward(request, response);	
		//response를 넘겨줌ㄴ
	
	}
	

}
