package sec01.ex01;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {
	@Override
	public void init() throws ServletException {
		System.out.println("iniit 메서드 호출");

	}
	@Override
	protected void doGet(HttpServletRequest request,HttpServletResponse resp)throws ServletException,IOException{
		System.out.println("doget 메서드 호출");
	}
	@Override
	public void destroy() {
		System.out.println("destory 메서드 호출");
	}
	
	
}
