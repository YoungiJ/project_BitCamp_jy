package Thread2;

public class TaskEx {
	
	//�۾� ������ ��ü ���� 
//	Thread thread= new Thread(Runnable target);
	
	//runnable ���� ��ü ����
	Runnable task=new Task();
	Thread thread2=new Thread(task);
	
	//�͸� ��ü�� �����
	Thread thread3=new Thread(
			new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
				
					
				}
			});
}
