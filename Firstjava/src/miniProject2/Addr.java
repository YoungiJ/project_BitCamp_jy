package miniProject2;

//Addr
public class Addr {
	//�ʵ� ���� -> private���� �ؼ� get, set������
	private String name;
	private String phoneNum;
	private String email;
	private String address;
	private String group;//ģ��,����

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
	
	
	//��ü ���� ���
	public void printAddr() {
		System.out.println("--------------------------------------");
		System.out.println("�̸� : " + name);
		System.out.println("��ȭ��ȣ : " + phoneNum);
		System.out.println("�̸��� : " + email);
		System.out.println("�ּ� : " + address);
		System.out.println("�׷�(ģ��/����) : " + group);
	}	



}
