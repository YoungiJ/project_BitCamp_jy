package API;

public class SmartPheon {
	private String company;
	private String os;
	
	public SmartPheon(String company,String os) {
		// TODO Auto-generated constructor stub
		this.company=company;
		this.os=os;
	}
	
	@Override
	public String toString() {
		
		
		return company+","+os;
	}
	

}
