package chpter01;

public class Tire {
	//�ʵ�
	public int maxRot;
	public int accRot;
	public String location;
	
	//������
	
	Tire(String location,int maxRot){
			
		this.location=location;
		this.maxRot=maxRot;
		
	}
	
	//roll �޼���
	public boolean roll() {
		++accRot;
		if(accRot<maxRot) {
			System.out.println(location+"Ÿ�̾� ����:"+(maxRot-accRot));
		return true;}
		else {
			System.out.println("Ÿ�̾� ��ũ");
			return false;
		}
		
		
		
	}
}
