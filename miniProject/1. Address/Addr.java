package chpter01;

//Addr
public class Addr {
	//필드 정의
	private String name;
	private String phoneNum;
	private String email;
	private String address;
	private String group;//친구,가족
	
	//생성자
	public Addr() {
		this(null, null, null, null, null);
	
		
	}
	//생성자-> overloading
	
	
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


}
