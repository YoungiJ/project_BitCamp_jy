package NestedClass;

public class Car {
	

	//�ʵ� 
	//�޼���
	
	//Ÿ�̾� ��ü 1 ����
	private Tire tire1=new Tire();

	
	//�͸�ü2 ����
	private Tire tire2=new Tire() {
		@Override
		//�ν� �ʵ�,�޼��� 
		public void roll() 
		{System.out.println("�͸�ü2 �� ��������");}
	};
		
	
	
	//run1(�ʵ�,run2(local,run3(�Ű�
	void run1(){
		tire1.roll();
		tire2.roll();
	}	
	
	
	
	//�����̶�� Ŭ���� �ȿ� �͸�ü ����
	
	public void run2() {
		//�͸� ��ü Ÿ�̾� ����
			Tire tire=new Tire() {
				@Override
				public void roll() {
					System.out.println("�͸�ü3 �� ��������");
					
				}
				
			};
		//��ü �޼��� Ȱ��
			tire.roll();
	
	}

	//���� ��ü�� �־��ֱ�
	void run3(Tire tire) {
		//��ü �޼��� Ȱ��
		tire.roll();

		
	}
}
