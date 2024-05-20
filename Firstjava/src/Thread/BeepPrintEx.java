package Thread;


public class BeepPrintEx {
	public static void main(String[]args) {
//	Runnable beepTask=new BeepTask();// promotion
//	Thread thread=new Thread(beepTask);
//	thread.start();
		
	//익명객체
//	Thread thread=new Thread(new Runnable() {
//		
//		@Override
//		public void run() {
//			// TODO Auto-generated method stub
//			System.out.println("달려라");
//		}
//	});
//			
//	
//	thread.start();

		
		// 툴킷 객체 생성
//		Thread thread=new Thread(
//				new Runnable() {
//					
//					@Override
//					public void run() {
//						// TODO Auto-generated method stub
//						for(int i=0;i<4;i++) {
//							try{
//								Thread.sleep(300);}//예외가 발생할 것 같은 코드를 try에 넣어야지}
//							catch (Exception e) {
//								// TODO: handle exception
//							}
//						}
//					}
//				});
//	
//	thread.start();
		
		
		//편한 2번 방법
		//자식 클래스만들어서 사용하기->위에서는 runnable class로 구현
		Thread thread=new Thread() {
				
				@Override
				public void run() {
					for(int i=0;i<5;i++) {

					try {
						Thread.sleep(400);
						System.out.println("자는중");
					}catch (Exception e) {
						// TODO: handle exception
						System.out.println("오잉");
					}}
				}};
		
		thread.start();
	
	
	}}