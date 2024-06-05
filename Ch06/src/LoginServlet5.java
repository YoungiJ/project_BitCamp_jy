import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login5")
public class LoginServlet5 extends HttpServlet{
	
	public void init() throws ServletException{
		System.out.println("init 메서드 호출");
	}
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{

		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();


		String user_id=request.getParameter("user_id");
		String user_pw=request.getParameter("user_pw");
		String user_address=request.getParameter("user_address");
		
		System.out.println("아이디"+user_id);
		System.out.println("패스워드"+user_pw);
//		System.out.println("주소"+user_address); 사용자에게는 보이지 않음


		String data="<html>";
		data+="<body>";
		data+="아이디:"+user_id;
		data+="<br>";
		data+="패스워드:"+user_pw;
		data+="<br>";
		data+="주소:"+user_address;
		data+="</body>";
		data+="</html>";
		out.print(data);
	
	}
	
	public void destroy() {
		System.out.println("destroy 메서드 호출");
	}
	
}
