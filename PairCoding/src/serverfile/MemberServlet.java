package serverfile;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.List;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet("/userLogin")
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
		
		
		//**************************************
		List<MemberVO> memberList=dao.listMembers();
		request.setAttribute("memberList", memberList);
		
		RequestDispatcher dispatch=request.getRequestDispatcher("viewMembers");
		dispatch.forward(request, response);
		//**************************************
		
		System.out.println();
		
		
	}
	
}
