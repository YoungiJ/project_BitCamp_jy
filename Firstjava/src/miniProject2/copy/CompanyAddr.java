package miniProject2.copy;

import miniProject2.Addr;

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
	
	public String getCompanyName() {
		return companyName;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public String getPosition() {
		return position;
	}
	
	public void setcompanyName(String companyName) {
		this.companyName=companyName;
	}
	public void setdepartmentName(String departmentName) {
		this.departmentName=departmentName;
	}
	public void setPosition(String position) {
		this.position=position;
	}
	@Override
	public void showData() {
		System.out.println("--------------------------------------");
		System.out.println("�̸� : " + super.getName());
		System.out.println("��ȭ��ȣ : " + super.getPhoneNum());
		System.out.println("�̸��� : " + super.getEmail());
		System.out.println("�ּ� : " + super.getAddress());
		System.out.println("�׷�(ģ��/����) : " + super.getGroup());
		System.out.println("ȸ���̸� : " + companyName);
		System.out.println("�μ��̸� : " + departmentName);
		System.out.println("���� : " + position);		
	}	
}
