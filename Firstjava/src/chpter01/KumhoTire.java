package chpter01;

public class KumhoTire extends Tire{
	//������
	public KumhoTire(String location,int maxRot) {
		// TODO Auto-generated constructor stub
		super(location,maxRot);
	}
	
	//override
	@Override
	public boolean roll() {
		++accRot;
		if(accRot<maxRot) {
			System.out.println(location+"��ȣŸ�̾� ����:"+(maxRot-accRot));
		return true;}
		else {
			System.out.println("Ÿ�̾� ��ũ");
			return false;
		}
		
		
		
	}
}
