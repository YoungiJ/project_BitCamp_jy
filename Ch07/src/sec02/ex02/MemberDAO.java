package sec02.ex02;

import java.util.List;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Date;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;


public class MemberDAO {
	private Connection con;
	private PreparedStatement pstmt;
	private DataSource dataFactory;
	
	public MemberDAO() {
		try {
			Context ctx = new InitialContext();
			Context envContext = (Context) ctx.lookup("java:/comp/env");
			dataFactory = (DataSource) envContext.lookup("jdbc/Oracle11g");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public List<MemberVO> listMembers() {
		List<MemberVO> list = new ArrayList<MemberVO>();
	    try {
	    	con=dataFactory.getConnection();
	    	
	        String query = "SELECT * FROM t_member";
	        System.out.println(query);
	        
	        pstmt = con.prepareStatement(query); // 문장으로 쓴 query를 해석.
	        ResultSet rs = pstmt.executeQuery();
	        
	        while (rs.next()) {
	            String id = rs.getString("id");
	            String pwd = rs.getString("pwd");
	            String name = rs.getString("name");
	            String email = rs.getString("email");
	            Date joinDate = rs.getDate("joinDate");
	                
	                MemberVO vo = new MemberVO();
	                vo.setId(id);
	                vo.setPwd(pwd);
	                vo.setName(name);
	                vo.setEmail(email);
	                vo.setJoinDate(joinDate);
	                
	                list.add(vo);
	            }
	            
	            rs.close();
	            pstmt.close();
	            con.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	    return list;
	}
		
	public void addMember(MemberVO vo) {
		try {
			// 커넥션 풀에서 만들어놓은 thread를 가져온다
			con = dataFactory.getConnection();
			String id = vo.getId();
			String pwd = vo.getPwd();
			String name = vo.getName();
			String email = vo.getEmail();
			String query = "insert into t_member";
			query += "(id,pwd,name,email)";
			query += "values(?,?,?,?)";
			System.out.println("prepareStatement: " + query);
			
			//커넥션 풀에서 가져온 객체에다가 쿼리를 실핼할 준비를 한다.
			pstmt = con.prepareStatement(query);
			//binding
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			pstmt.setString(3, name);
			pstmt.setString(4, email);
			//excuteUPdate랑 excuteQureyt
			pstmt.executeUpdate();
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void print() {
		System.out.println("test");
	}
	
	public void delMember(String id) {
		try {
			con = dataFactory.getConnection();
			String query = "delete from t_member where id=?";
			System.out.println("prepateStatement: " + query);
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, id);
			pstmt.executeUpdate();
			pstmt.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}