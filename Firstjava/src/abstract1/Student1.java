package abstract1;

public class Student1 extends LunchMenu{
//��ü�� ����
	Student1 stu=new Student1();
//�޼��� ����
	public void cal() {
		// price�� ������� ���� �ֱ� ������ ��ü �������ص� ��
		price=Price.getRice()+Price.getBanana();//Ŭ�������� ���ٰ���
		System.out.println(price);
		
	}
	
	
}