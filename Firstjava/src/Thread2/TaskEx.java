package Thread2;

public class TaskEx {
	
	//작업 쓰레드 객체 생성 
//	Thread thread= new Thread(Runnable target);
	
	//runnable 구현 객체 생성
	Runnable task=new Task();
	Thread thread2=new Thread(task);
	
	//익명 객체로 만들기
	Thread thread3=new Thread(
			new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
				
					
				}
			});
}
