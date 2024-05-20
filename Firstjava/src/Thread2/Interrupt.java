package Thread2;

public class Interrupt extends Thread {
	
	//객체 run method
	// try-catch
	
	@Override
	public void run() {//3
		
		
		try {
			while(true) {
			System.out.println("실행중");
//			if(Thread.interrupted())
//			{//interrupted method가 들어오면->
//				System.out.println("interrupt");
//			}
			Thread.sleep(1000);

			}}
		
		 catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("while 문을 탈출함");
			

}
		System.out.println("자원을 정리");
		System.out.println("쓰레드를 종료");
		

	}

}
