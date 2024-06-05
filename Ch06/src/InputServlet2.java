import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/input2")
public class InputServlet2 extends HttpServlet{
	
	public void init() throws ServletException{
		System.out.println("init 메서드 호출");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
	// 나중에는 할 필요 없음
	request.setCharacterEncoding("utf-8");
	
	Enumeration enu=request.getParameterNames();
	while(enu.hasMoreElements()) {
		String name=(String)enu.nextElement();
		//name이 subject인 것들을 string배열 타입으로 가져옴

		String[] values=request.getParameterValues(name);
		for(String value:values) {
			//name은 어짜피 똑같음
			System.out.println("name: "+name+"value:"+ value);
		}
	}
	

}
	public void destroy() {
		System.out.println("destroy 메서드 호출");
	}
	
}
