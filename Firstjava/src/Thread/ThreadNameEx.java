package Thread;

public class ThreadNameEx {
	public static void main(String[] args) {
		
		//���� ������
		Thread mainThread=Thread.currentThread();
		System.out.println(mainThread);
	
		ThreadA threadA=new ThreadA();
		System.out.println("������ �̸�"+threadA.getName());//�����ڿ��� set�� �����ϱ� �̸� ���
		threadA.start();

		ThreadB threadB=new ThreadB();
		System.out.println("������ �̸�"+threadB.getName());
		threadB.start();//�̸��� ���� ���� ������ Thread-1 ���ڰ� �ڿ� �پ ��µ�
		//�� �ð� ��ĳ �Ȱ���
	}
}
