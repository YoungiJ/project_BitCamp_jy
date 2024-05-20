package chpter01;

public class MemberTest {
	public static void main(String[] args) {
		
		
		//인스생성
		Member m1=new Member("황지영","010-4804-3206","소프트웨어학과",3,"hjy020714@gmail.com","2002-07-14","경기도 용인시 기흥구");
		Member m2=new Member("이현지","010-1234-7894","인공지능",3,"hwe@naver.com");
		
		
		//데이터 출력

		m1.printMember();
		System.out.println("----------------------");
		m2.printMember();
		
	}
	
	
	
}
