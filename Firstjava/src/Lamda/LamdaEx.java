package Lamda;


public class LamdaEx {
	public static void main(String[] args) {
	//���ٽ�->�͸��� ��ü (�̸��� ���� �������̽� ��ü ���� implements�� �ؾߵǴµ�_)
	action((x,y)->{
		
		//������ ó����
		int result=x+y;
		System.out.println(result);
	});
	
	
	action((x,y)->{
		
		//������ ó����
		int result=x-y;
		System.out.println(result);
	});
	
	}
	//action �Լ� ���� interface �Ű������� �͸� ������ü�� ��= Ÿ���� interface
	public static void action(Calculable calculable) {
		int x=10;
		int y=4;
		calculable.calculate(x, y);// interface�� ������ ������ ���ٽĿ��� �߱⶧���� (x,y)-> ������ ó���ο��� ���
	}
	
	
}
