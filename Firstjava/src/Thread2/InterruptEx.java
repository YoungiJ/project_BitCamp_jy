package Thread2;

public class InterruptEx {
	public static void main(String[]arg) {
	
	//쓰레드 객체 만들어서 -> start-> interrupt method만듥
		Thread thread=new Interrupt();//1
		thread.start();//2
		
		try {
			Thread.sleep(3000);
			//5초동안 main thread는 정지하고 thread2가1초마다 실행&정지를 반복하다가-> 끝나니까 interrupt가 들어감
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	
		thread.interrupt();//정지했을 때 -> interrupt가 발생하면 Exception으로 넘어감		

	
	}

}
