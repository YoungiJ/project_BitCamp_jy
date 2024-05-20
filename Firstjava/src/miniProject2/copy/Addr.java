package miniProject2.copy;

public class Addr implements ShowData{
	private String name;
	private String phoneNum;
	private String email;
	private String address;
	private String group;//친구,가족

	public Addr(String name,String num,String email,String addr,String group, String clientName, String tradingItem, String position2) {
		this.name=name;
		this.phoneNum=num;
		this.email=email;
		this.address=addr;
		this.group=group;
	
	}
	
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
	
	
	@Override
	public void showData() {
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phoneNum);
	}
}
