package DesignPattern;

public class HomeApplicance {

	//�ʵ�
	private int serialNo;
	private String manufacturer;
	private int year;
	
	//������
	public HomeApplicance(int serialNo,String manufacturer,int year) {
		// TODO Auto-generated constructor stub
		this.serialNo=serialNo;
		this.manufacturer=manufacturer;
		this.year=year;
	}
	//method
	public void turnOn(String name) {
		System.out.println(name+"�մϴ�.");
		
	}
	
	public void turnOff(String name) {
	
		System.out.println(name+"�� ���ϴ�.");

		}
	
	//get,set
	public int getSerialNo() {
		return serialNo;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public int getYear() {
		return year;
	}

}


