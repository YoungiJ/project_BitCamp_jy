package abstract1;

public class Price {
	//������ �����;���-> static final
	private static final int RICE=1000;//
	
	
	private static final int MILK=2000;//
	private static final int BANANA=3000;//
	
	//�����ڷ� ȣ���Ҷ� ��ü�� �ö����� ���ھ�-> �����ڿ��� ����
	//����� static�� �ö󰡼� �����Ӱ� ����ϴ� ���� �� ����
	
	Price(){
	
		
	}
	
	public static int getRice() {
		return RICE;
	}
	public static int getBanana() {
		return BANANA;
	}
	public static int getMilk() {
		return MILK;}
}
