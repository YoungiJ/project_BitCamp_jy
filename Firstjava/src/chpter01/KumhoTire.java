package chpter01;

public class KumhoTire extends Tire{
	//생성자
	public KumhoTire(String location,int maxRot) {
		// TODO Auto-generated constructor stub
		super(location,maxRot);
	}
	
	//override
	@Override
	public boolean roll() {
		++accRot;
		if(accRot<maxRot) {
			System.out.println(location+"금호타이어 수명:"+(maxRot-accRot));
		return true;}
		else {
			System.out.println("타이어 펑크");
			return false;
		}
		
		
		
	}
}
