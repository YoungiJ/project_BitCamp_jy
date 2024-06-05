package sec02.ex02;

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
 * Servlet implementation class ViewServlet
 */
//@WebServlet("/viewMembers")
public class ViewServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//DB에서 객체 정보를 끌어와서  html로 보여줌-> table -> 현재 view를 분리를 안한 상황
				
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();

		List memberList=(List)request.getAttribute("memberList");
		
		out.print("<html><body>");
		out.print("<table border=1><tr align='center' bgcolor='pink'>");
		out.print("<td>아이디</td><td>비밀번호</td><td>이름</td><td>이메일</td><td>가입일</td><td>삭제</td></tr>");
		
		// ㅣlist 객체를 까서 >String으로 저장=> db에 저장되어잇는 형태로 html에 보여줄 수 없기 때문에
		for(int i=0; i<memberList.size(); i++) {
			MemberVO memberVO=(MemberVO) memberList.get(i);
			String id=memberVO.getId();
			String pwd=memberVO.getPwd();
			String name=memberVO.getName();
			String email=memberVO.getEmail();
			Date joinDate=(Date) memberVO.getJoinDate(); // ??
			
			//여기서 삭제버튼을 누르면 command=del 파라미터가 전달
			out.print("<tr><td>" + id + "</td><td>"
					+ pwd + "</td><td>"
					+ name + "</td><td>"
					+ email + "</td><td>"
					+ joinDate + "</td><td>"
					+ "<a href=/Ch08/member5?command=delMember&id="+id+">삭제</a></td></tr>");
		}
		out.print("</table></body></html>");
		out.print("<a href='/Ch08/memberForm.html'>새 회원 등록하기</a>");


	}



}
