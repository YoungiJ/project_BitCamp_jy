package sec02.ex02;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.List;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


//@WebServlet("/member3")
public class MemberServlet extends HttpServlet {
	
	// get으로 받든, post로 받든 변환해줌.
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}
	
	
	private void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		//DB에 request해주는 객체
		MemberDAO dao=new MemberDAO();
		//출력하기 위한 출력 스트림
		PrintWriter out=response.getWriter();
		//이름이 command인 파라미터가 요청되면 여기에 넣음->  addmember
		String command=request.getParameter("command");
		
		//db에 넣고 싶은 상황=> 객체로 넣자
		if(command!=null && command.equals("addMember")) {
			String _id=request.getParameter("id");
			String _pwd=request.getParameter("pwd");
			String _name=request.getParameter("name");
			String _email=request.getParameter("email");
			
			//vo객체로 만들자
			MemberVO vo=new MemberVO();
			vo.setId(_id);
			vo.setPwd(_pwd);
			vo.setName(_name);
			vo.setEmail(_email);
			dao.addMember(vo);
		} 
		
		//delete를 하고 싶은 상황-> command가 del이면?-> id을 get파라미터로 전달받아서 저장
		else if(command!=null && command.equals("delMember")) {
		
			String id = request.getParameter("id");
			//dao의 delmember 함수를 호출
			dao.delMember(id);
		}
		
		System.out.println();
		
		//DB에서 객체 정보를 끌어와서  html로 보여줌-> table -> 현재 view를 분리를 안한 상황
		List list=dao.listMembers();
		out.print("<html><body>");
		out.print("<table border=1><tr align='center' bgcolor='pink'>");
		out.print("<td>아이디</td><td>비밀번호</td><td>이름</td><td>이메일</td><td>가입일</td><td>삭제</td></tr>");
		
		// ㅣlist 객체를 까서 >String으로 저장=> db에 저장되어잇는 형태로 html에 보여줄 수 없기 때문에
		for(int i=0; i<list.size(); i++) {
			MemberVO memberVO=(MemberVO) list.get(i);
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
					+ "<a href=/Ch07/member3?command=delMember&id="+id+">삭제</a></td></tr>");
		}
		out.print("</table></body></html>");
		out.print("<a href='/Ch07/memberForm.html'>새 회원 등록하기</a>");
	}
	
}
