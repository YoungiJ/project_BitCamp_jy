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
		//this�� ����ȭ
		this(memberName,phoneNum,major,grade,email,"��������","��������");
	
}
	//1. ���
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
	
	
	//2.����, �ּ� X => overloading
	

	
	void printMember() {
		
		System.out.println("�̸�: "+memberName);
		System.out.println("��ȭ��ȣ: "+phoneNum);
		System.out.println("����: "+major);
		System.out.println("�г�: "+grade);
		System.out.println("�̸���: "+email);
		System.out.println("����: "+birth);
		System.out.println("�ּ�: "+address);
		
	}

}
