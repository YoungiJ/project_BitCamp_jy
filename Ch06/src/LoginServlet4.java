import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login4")
public class LoginServlet4 extends HttpServlet{
	
	public void init() throws ServletException{
		System.out.println("init 메서드 호출");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		// 나중에는 할 필요 없음
		System.out.println("doGet 메서드 호출");
		doHandle(request,response);

	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{

	
		System.out.println("doPost 메서드 호출");
		doHandle(request,response);

}
	protected void doHandle(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		// 나중에는 할 필요 없음
		request.setCharacterEncoding("utf-8");
		System.out.println("doHandle 메서드 호출");

		String user_id=request.getParameter("user_id");
		String user_pw=request.getParameter("user_pw");
		
		System.out.println("아이디"+user_id);
		System.out.println("패스워드"+user_pw);


	}
	
	public void destroy() {
		System.out.println("destroy 메서드 호출");
	}
	
}
