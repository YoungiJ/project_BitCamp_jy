package Thread2;

public class Interrupt extends Thread {
	
	//��ü run method
	// try-catch
	
	@Override
	public void run() {//3
		
		
		try {
			while(true) {
			System.out.println("������");
//			if(Thread.interrupted())
//			{//interrupted method�� ������->
//				System.out.println("interrupt");
//			}
			Thread.sleep(1000);

			}}
		
		 catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("while ���� Ż����");
			

}
		System.out.println("�ڿ��� ����");
		System.out.println("�����带 ����");
		

	}

}
