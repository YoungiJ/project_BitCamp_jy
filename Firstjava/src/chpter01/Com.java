package chpter01;

public class Com extends Cal{
	public static final int NORMAL=1;
	public static final int SUPERSONIC=2;
	
	public static int flymode=NORMAL;
	@Override
	public void fly() {
		
		
		if(flymode==SUPERSONIC) {
		System.out.println("��� �����մϴ�.");}
		else {		
			super.fly();//�θ��� �޼��带 ȣ���ϰ� ������
		}
			}
}
	


