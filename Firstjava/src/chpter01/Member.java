package chpter01;

public class Member{
	
	String memberName;
	String phoneNum;
	String major;
	int grade;
	String email;
	String birth;
	String address;
	Member(String memberName,String phoneNum,String major,int grade,String email){
		//this로 간소화
		this(memberName,phoneNum,major,grade,email,"정보없음","정보없음");
	
}
	//1. 모든
	Member(String memberName,String phoneNum,String major,int grade,
			String email,String birth,String address){
		this.memberName=memberName;
		this.phoneNum=phoneNum;
		this.major=major;
		this.grade=grade;
		this.email=email;
		this.birth=birth;
		this.address=address;
		
		
	}
	
	
	//2.생일, 주소 X => overloading
	

	
	void printMember() {
		
		System.out.println("이름: "+memberName);
		System.out.println("전화번호: "+phoneNum);
		System.out.println("전공: "+major);
		System.out.println("학년: "+grade);
		System.out.println("이메일: "+email);
		System.out.println("생일: "+birth);
		System.out.println("주소: "+address);
		
	}

}
