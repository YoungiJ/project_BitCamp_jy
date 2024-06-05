//package sec02.ex01;
//
////javax가 아니라 java , sql 관련된 건 sql로 접근
//import java.sql.PreparedStatement;
//import java.sql.Connection;
//import java.sql.Date;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//
//
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.naming.Context;
//import javax.naming.InitialContext;
//import javax.sql.DataSource;
//
//
//public class MemberDAO {
//	
//	// 얘랑 conndb는 더이상 필요없음-> contet.xml에 저장해놨기 때문에
////    private static final String driver = "oracle.jdbc.driver.OracleDriver";
////    private static final String url = "jdbc:oracle:thin:@localhost:1521:XE";
////    private static final String user = "scott";
////    private static final String pwd = "tiger";
//    
//    private Connection con;
//    private PreparedStatement pstmt;
//    private DataSource dataFactory;
//    //생성자
//    public MemberDAO() {
//    	try {
//    		// 잔디(key, value로 접근)에 접근하기 위해 기본 경로를 설정
//           	Context ctx=new InitialContext();
//        	Context envContext=(Context)ctx.lookup("java:/comp/env");
//        	//톰캣 context.xml에서 설정한 name값인 dbc/Oracle11g을 이용해
//        	//톰캣이 미리 연결한 datasource를 받아온다.
//        	dataFactory=(DataSource)envContext.lookup("jdbc/Oracle11g");
//        	        	
//    	}
//    	catch (Exception e) {
//			// TODO: handle exception
//    		e.printStackTrace();
//		}
//    }
//    
//    public List<MemberVO> listMembers() {
//        List<MemberVO> list = new ArrayList<MemberVO>();
//        try {
//        	        	
//            //connDB();
//        	//데이터 소스를 이용해 데이터 베이스에 연결
//        	con=dataFactory.getConnection();
//        	
//        	
//            String query = "SELECT * FROM t_member";
//            System.out.println(query);
//            
//            pstmt = con.prepareStatement(query); // Prepare the SQL statement here
//            ResultSet rs = pstmt.executeQuery();
//            
//            while (rs.next()) {
//                String id = rs.getString("id");
//                String pwd = rs.getString("pwd");
//                String name = rs.getString("name");
//                String email = rs.getString("email");
//                Date joinDate = rs.getDate("joinDate");
//                
//                MemberVO vo = new MemberVO();
//                vo.setId(id);
//                vo.setPwd(pwd);
//                vo.setName(name);
//                vo.setEmail(email);
//                vo.setJoinDate(joinDate);
//                
//                list.add(vo);
//            }
//            
//            rs.close();
//            pstmt.close();
//            con.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return list;
//    }
//
////    private void connDB() {
////        try {
////            Class.forName(driver);
////            System.out.println("oracle 드라이버 로딩 성공");
////            con = DriverManager.getConnection(url, user, pwd);
////            System.out.println("Connection 성공");
////        } catch (Exception e) {
////            e.printStackTrace();
////        }
////    }
//}
