package chpter01;

public class Com extends Cal{
	public static final int NORMAL=1;
	public static final int SUPERSONIC=2;
	
	public static int flymode=NORMAL;
	@Override
	public void fly() {
		
		
		if(flymode==SUPERSONIC) {
		System.out.println("고속 비행합니다.");}
		else {		
			super.fly();//부모의 메서드를 호출하고 싶을때
		}
			}
}
	


