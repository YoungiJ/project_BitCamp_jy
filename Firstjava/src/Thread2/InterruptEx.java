package Thread2;

public class InterruptEx {
	public static void main(String[]arg) {
	
	//������ ��ü ���� -> start-> interrupt method����
		Thread thread=new Interrupt();//1
		thread.start();//2
		
		try {
			Thread.sleep(3000);
			//5�ʵ��� main thread�� �����ϰ� thread2��1�ʸ��� ����&������ �ݺ��ϴٰ�-> �����ϱ� interrupt�� ��
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	
		thread.interrupt();//�������� �� -> interrupt�� �߻��ϸ� Exception���� �Ѿ		

	
	}

}
