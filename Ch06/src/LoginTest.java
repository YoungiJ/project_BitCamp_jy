import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login6")
public class LoginTest extends HttpServlet{
	
	public void init() throws ServletException{
		System.out.println("init 메서드 호출");
	}
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{

		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();


		String user_id=request.getParameter("user_id");
		String user_pw=request.getParameter("user_pw");
		
		System.out.println("아이디"+user_id);
		System.out.println("패스워드"+user_pw);
//		System.out.println("주소"+user_address); 사용자에게는 보이지 않음

		if(user_id!=null&&(user_id.length()!=0)) {
		out.print("<html>");
		out.print("<body>");
		out.print(user_id+"+\"님이 로그인하셨습니다.\"");
		out.print("</body>");
		out.print("</html>");}

		
	
		else {
			out.print("<html>");
			out.print("<body>");
			out.print("아이디를 입력하세요");
			out.print("<a href='http://localhost:8181/Ch06/login6.html>이동</a>");
			out.print("</body>");
			out.print("</html>");
		}

	
	}
	
	public void destroy() {
		System.out.println("destroy 메서드 호출");
	}
	
}
