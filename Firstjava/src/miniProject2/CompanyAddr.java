package miniProject2;

public class CompanyAddr extends Addr {
	String companyName;
	String departmentName;
	String position;
	
	public CompanyAddr(String name, String phoneNum, String email, String addr, String group,String companyName,String departmentName,String position) {
		super(name,phoneNum,email,addr,group);
		this.companyName=companyName;
		this.departmentName=departmentName;
		this.position=position;
		
		
	}
	
	@Override
	public void printAddr() {
		System.out.println("--------------------------------------");
		System.out.println("이름 : " + super.getName());
		System.out.println("전화번호 : " + super.getPhoneNum());
		System.out.println("이메일 : " + super.getEmail());
		System.out.println("주소 : " + super.getAddress());
		System.out.println("그룹(친구/가족) : " + super.getGroup());
		System.out.println("회사이름 : " + companyName);
		System.out.println("부서이름 : " + departmentName);
		System.out.println("직급 : " + position);		
	}	
	
	

}
