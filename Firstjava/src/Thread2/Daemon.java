package Thread2;

public class Daemon extends Thread{
	
	public void set() {
		System.out.println("작업 내용 저장");
	}
	@Override
	public void run() {
		while(true) {
		 System.out.println("실행중");
		try {
			Thread.sleep(100);
		//
		} 
		catch (InterruptedException e) {
            System.out.println("종료");
		}	
		set();
		}
	}
}

/*
 * 
 * 
 *원래라면 실행중, 작업 내용 저장이 계속 반복되야하는데 
 *메인스레드가 종료되니까 데몬 쓰레드도 출력안함 
 *
 *
 *interrupted method 지우니까 실행중, 작업 내용 저장이 계속 반복
 *
 *
 *
 **/

