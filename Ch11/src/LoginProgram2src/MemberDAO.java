package LoginProgram2src;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.http.HttpServlet;
import javax.sql.DataSource;


public class MemberDAO extends HttpServlet{
//	servlet controller, frontcontroller역할
	
	//DB와 연결하기 위한 api가져오기
	private Connection conn;
	private PreparedStatement pstmt;
	private DataSource dataFactory;//connection pooling//web.xml
	
		
	public MemberDAO() {
		try {
			Context ctx = new InitialContext();
			Context envContext = (Context) ctx.lookup("java:/comp/env");
			dataFactory = (DataSource) envContext.lookup("jdbc/Oracle11g");
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();

		}
	}
	
	//select해서 가져오기-> 데이터를 가져와서 객체에 넣어주고 list에 넣어줌
	public List ListMembers() {
		List<MemberBean> list=new ArrayList<MemberBean>();
		try {
			//시퀄 실행하기****
			conn =dataFactory.getConnection();
			
			String query="select * from t_member";
			
			//문장으로 쓴 쿼리를 해석***
			pstmt=conn.prepareStatement(query);
			//찐으로 실행
			ResultSet rs=pstmt.executeQuery();
			//**
			while(rs.next()) {
				
				String id=rs.getString("id");
				String pwd=rs.getString("pwd");
				String name=rs.getString("name");
				String email=rs.getString("email");
				Date joinDate=rs.getDate("joinDate");
				
				//객체에다가 넣기
				MemberBean mBean=new MemberBean();
				mBean.setId(id);
				mBean.setPwd(pwd);
				mBean.setName(name);
				mBean.setEmail(email);
				mBean.setJoinDate(joinDate);
				
				//list에 add하기
				list.add(mBean);
				
			}
			//반환할 거 반환하기
			rs.close();
			pstmt.close();
			conn.close();
						
		}catch (Exception e) {
			e.printStackTrace();
		}
		return list;
		
	}
	// 추가하기-> 객체-> table에 넣기
    public void addMember(MemberBean bean) {

        // 쓰레드를 하나 가져와야 연결할 수가 있단다****반드시 trycatch나 exception을 써야함
        try {
            Connection conn = dataFactory.getConnection();

            // **get으로 받기
            String id = bean.getId();
            String pwd = bean.getPwd();
            String name = bean.getName();
            String email = bean.getEmail();

            String query = "insert into t_member (id, pwd, name, email) VALUES (?, ?, ?, ?)";

            // 문장으로 쓴 쿼리를 해석***
            pstmt = conn.prepareStatement(query);
            // binding
            pstmt.setString(1, id);
            pstmt.setString(2, pwd);
            pstmt.setString(3, name);
            pstmt.setString(4, email);

            pstmt.executeUpdate();
            pstmt.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	public void delMember(String id) {
		try {
			conn=dataFactory.getConnection();
			
			String query="delete from t_member where id=?";
			
			pstmt=conn.prepareStatement(query);
			
			pstmt.setString(1, id);
			pstmt.executeUpdate();
			pstmt.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
