package chpter01;

public class Tire {
	//필드
	public int maxRot;
	public int accRot;
	public String location;
	
	//생성자
	
	Tire(String location,int maxRot){
			
		this.location=location;
		this.maxRot=maxRot;
		
	}
	
	//roll 메서드
	public boolean roll() {
		++accRot;
		if(accRot<maxRot) {
			System.out.println(location+"타이어 수명:"+(maxRot-accRot));
		return true;}
		else {
			System.out.println("타이어 펑크");
			return false;
		}
		
		
		
	}
}
