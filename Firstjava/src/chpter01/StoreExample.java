package chpter01;

public class StoreExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//����
		MainStore m=new MainStore();
		System.out.println("����");
		m.print();
		System.out.println("========================");

		//ù��° ��
		
//		MainStore m1=new FirstStore();//�̷��� �ϸ� �⺻ �����ڰ� ��� �����ȵ�
		MainStore m1=new FirstStore("7000","8000","12000","�Ǹ����� �ʽ��ϴ�.","1000");
		System.out.println("���� 1ȣ��");
		m1.print();
		System.out.println("========================");
		//�ι�° ��
//		MainStore m2=new SecondStore("5000","5000","10000","3000","�����Դϴ�.");
		
		MainStore m2=new SecondStore("23", "23","23");
		System.out.println("���� 2ȣ��");
		m2.print();
		System.out.println("========================");

		
		MainStore m3=new ThirdStore("7000","7000","12000","3000","1000");
		System.out.println("���� 3ȣ��");
		m3.print();

	}

}
