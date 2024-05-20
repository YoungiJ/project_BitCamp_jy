package miniProject2;

//Addr
public class Addr {
	//필드 정의 -> private으로 해서 get, set쓰도록
	private String name;
	private String phoneNum;
	private String email;
	private String address;
	private String group;//친구,가족

	public Addr(String name,String num,String email,String addr,String group) {
		this.name=name;
		this.phoneNum=num;
		this.email=email;
		this.address=addr;
		this.group=group;
	
		
	}
	//get
	
	public String getName() {
		return name;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public String getEmail() {
		return email;
	}
	public String getAddress() {
		return address;
	}
	public String getGroup() {
		return group;
	}
	
	//set
	public void setName(String newName) {
		name=newName;
	}
	public void setPhoneNum(String newphoneNum) {
		phoneNum=newphoneNum;
	}
	public void setEmail(String newemail) {
		email=newemail;
	}
	public void setAddress(String newaddress) {
		address=newaddress;
	}
	public void setGroup(String newgroup) {
		group=newgroup;
	}
	
	
	//객체 정보 출력
	public void printAddr() {
		System.out.println("--------------------------------------");
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phoneNum);
		System.out.println("이메일 : " + email);
		System.out.println("주소 : " + address);
		System.out.println("그룹(친구/가족) : " + group);
	}	



}
