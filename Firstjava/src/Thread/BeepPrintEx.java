package Thread;


public class BeepPrintEx {
	public static void main(String[]args) {
//	Runnable beepTask=new BeepTask();// promotion
//	Thread thread=new Thread(beepTask);
//	thread.start();
		
	//�͸�ü
//	Thread thread=new Thread(new Runnable() {
//		
//		@Override
//		public void run() {
//			// TODO Auto-generated method stub
//			System.out.println("�޷���");
//		}
//	});
//			
//	
//	thread.start();

		
		// ��Ŷ ��ü ����
//		Thread thread=new Thread(
//				new Runnable() {
//					
//					@Override
//					public void run() {
//						// TODO Auto-generated method stub
//						for(int i=0;i<4;i++) {
//							try{
//								Thread.sleep(300);}//���ܰ� �߻��� �� ���� �ڵ带 try�� �־����}
//							catch (Exception e) {
//								// TODO: handle exception
//							}
//						}
//					}
//				});
//	
//	thread.start();
		
		
		//���� 2�� ���
		//�ڽ� Ŭ�������� ����ϱ�->�������� runnable class�� ����
		Thread thread=new Thread() {
				
				@Override
				public void run() {
					for(int i=0;i<5;i++) {

					try {
						Thread.sleep(400);
						System.out.println("�ڴ���");
					}catch (Exception e) {
						// TODO: handle exception
						System.out.println("����");
					}}
				}};
		
		thread.start();
	
	
	}}