package chpter01;


public class ComEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Com saCom=new Com();
		
		saCom.takeOff();
		
		saCom.fly();
	

		saCom.flymode=Com.SUPERSONIC;
		saCom.fly();
		
		
		saCom.flymode=Com.NORMAL;
		saCom.fly();
		
		saCom.land();
		
	}

}
