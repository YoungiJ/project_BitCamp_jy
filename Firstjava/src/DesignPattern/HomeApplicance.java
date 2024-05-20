package DesignPattern;

public class HomeApplicance {

	//필드
	private int serialNo;
	private String manufacturer;
	private int year;
	
	//생성자
	public HomeApplicance(int serialNo,String manufacturer,int year) {
		// TODO Auto-generated constructor stub
		this.serialNo=serialNo;
		this.manufacturer=manufacturer;
		this.year=year;
	}
	//method
	public void turnOn(String name) {
		System.out.println(name+"켭니다.");
		
	}
	
	public void turnOff(String name) {
	
		System.out.println(name+"을 끕니다.");

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


