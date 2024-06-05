package sec01.ex02;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.sql.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.net.httpserver.Filter.Chain;

/**
 * Servlet implementation class LoginServlet
 */
public class EncoderFilter implements Filter {
      
	ServletContext context;
	//초기화
	public void init(FilterConfig fConfig) throws ServletException{
		
		System.out.println("utf-8 인코딩");
		//context객체를 저장할 변수를 선언
		//filterconfig를 통해 servletcontext를 가져와서 인코딩을 설정한다.
		context=fConfig.getServletContext();
	}
	
	//필터링 실행 (1차)
    @Override
	  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) 
	            throws IOException, ServletException {
	        System.out.println("dofilter 호출");
	        request.setCharacterEncoding("utf-8");
		
		String context=((HttpServletRequest)request).getContextPath();
		String pathinfo=((HttpServletRequest)request).getRequestURI();
		String realPath=request.getRealPath(pathinfo);
		String mesg="Context 정보"+context+"\n URI정보:"+pathinfo+"\n물리적 경로"+realPath;
		System.out.println(mesg);
	    // 요청의 컨텍스트 경로, URI 정보, 물리적 경로를 출력합니다.

		long begin=System.currentTimeMillis();
		//필터들을 순서대로 호출할 수 있는 구조 제공
		//chain객체를 이용해서 다음 필터 호출
		
		// 다음필터 호출	
		chain.doFilter(request,response);
		
		// 필터 작업후
		long end=System.currentTimeMillis();
		System.out.println("작업시간:"+(end-begin)+"ms");

		
	}
	public void destroy() {
		System.out.println("destroy 호출");
	}
	
	

	

}
