package Thread2;

public class WorkObject {
//�޼��� ����
	public synchronized void methodA() {
		Thread thread=Thread.currentThread();
		System.out.println(thread.getName()+":method A �۾�����");
		notify();
		
		try { wait();}//�����ϱ�
		catch (InterruptedException e) {
			// TODO: handle exception
		}
	}
	
	public synchronized void methodB() {
		Thread thread=Thread.currentThread();
		System.out.println(thread.getName()+":method B �۾�����");
		notify();
		
		try { wait();}//�����ϱ�
		catch (InterruptedException e) {
			// TODO: handle exception
		}
		
		
	}
}
