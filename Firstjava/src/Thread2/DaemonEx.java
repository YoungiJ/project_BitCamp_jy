package Thread2;

public class DaemonEx {
	public static void main(String[]arg) {
	//�־������� ���� �����带 ����-> ���ӵǱ� ������ �� �����尡 ����Ǹ� ���� �����嵵 �����
	Daemon daemon=new Daemon();
//	daemon.setDaemon(true);//Daemon ��ü�� -> ���� ������� ����
	daemon.start();
	
	
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO: handle exception

	}	
//	Thread.interrupted();//���ξ������ ���ᰡ �ȵ�?
	System.out.println("���� ������ ����");
	}

}
