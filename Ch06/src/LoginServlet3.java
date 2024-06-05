import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login3")
public class LoginServlet3 extends HttpServlet{
	
	public void init() throws ServletException{
		System.out.println("init 메서드 호출");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
	// 나중에는 할 필요 없음
	request.setCharacterEncoding("utf-8");
	//응답을 받을 때 -> html타입으로 응답을 보낸다-> 마찬가지로 utf8
	//응답 객체의 getWriter를 통해 출력 스트림 printwriter객체를 받아준다.
	String user_id=request.getParameter("user_id");
	String user_pw=request.getParameter("user_pw");
	System.out.println("아이디"+user_id);
	System.out.println("패스워드"+user_pw);


}
	public void destroy() {
		System.out.println("destroy 메서드 호출");
	}
	
}
