package sec01.ex01;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MemberServlet
 */
// servlet 매핑선언
@WebServlet("/member")
public class MemberServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		//무조건 response 보낼때는 printwriter 출력 스트림을 사용해야함=>? html을 코드 안에서 쓰기 때문에 사용하는건지 궁금쓰
		PrintWriter out=response.getWriter();
		
		//dao객체 생성 ->  클래스인데 DB정보를 request해줌-> sql이 쓰임-> 객체로 변환?
		MemberDAO dao=new MemberDAO();
		List<MemberVO> list=dao.listMembers();//??????
	
		out.print("<html><body>");
		//tr(행) align 중앙 정렬, td(열) - 맨위에 열이름만 만든 상태
		out.print("<table border=1><tr align='center' bgcolor='lightgreen'>");
		out.print("<td>아이디</td><td>비밀번호</td><td>이름</td><td>이메일</td><td>가입일</td></tr>");
		
		for(int i=0;i<list.size();i++) {
			//조회된 회원 정보를 리스트로 출력
			MemberVO memberVO=(MemberVO)list.get(i);//Vo= 객체-> JSP에 넘기기
			String id=memberVO.getId();
			String pwd=memberVO.getPwd();
			String name=memberVO.getName();
			String email=memberVO.getEmail();
			Date joinDate=memberVO.getJoinDate();
			
			//하나씩 행을 채우자
			out.print("<tr><td>"+id+"</td><td>"+
								pwd+"</td><td>"+
								name+"</td><td>"+
								email+"</td><td>"+
								joinDate+"</td></tr>");
		}
		// 마지막에 테이블 태그를 닫아 주자
		out.print("</table></body></html>");
		
			

			
			
			
		}
		
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
