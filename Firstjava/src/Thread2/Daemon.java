package Thread2;

public class Daemon extends Thread{
	
	public void set() {
		System.out.println("�۾� ���� ����");
	}
	@Override
	public void run() {
		while(true) {
		 System.out.println("������");
		try {
			Thread.sleep(100);
		//
		} 
		catch (InterruptedException e) {
            System.out.println("����");
		}	
		set();
		}
	}
}

/*
 * 
 * 
 *������� ������, �۾� ���� ������ ��� �ݺ��Ǿ��ϴµ� 
 *���ν����尡 ����Ǵϱ� ���� �����嵵 ��¾��� 
 *
 *
 *interrupted method ����ϱ� ������, �۾� ���� ������ ��� �ݺ�
 *
 *
 *
 **/

