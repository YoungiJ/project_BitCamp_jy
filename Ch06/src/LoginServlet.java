import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	
	public void init() throws ServletException{
		System.out.println("init 메서드 호출");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
	// 나중에는 할 필요 없음
	request.setCharacterEncoding("utf-8");
// 큰 따옴표로 user_id를 받음
	String user_id=request.getParameter("user_id");
	String user_pw=request.getParameter("user_pw");
	System.out.println("아이디"+user_id);
	System.out.println("패스워드"+user_pw);

}
	public void destroy() {
		System.out.println("destroy 메서드 호출");
	}
	
}
