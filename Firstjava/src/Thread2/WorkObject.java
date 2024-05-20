package Thread2;

public class WorkObject {
//메서드 정의
	public synchronized void methodA() {
		Thread thread=Thread.currentThread();
		System.out.println(thread.getName()+":method A 작업실행");
		notify();
		
		try { wait();}//정지하기
		catch (InterruptedException e) {
			// TODO: handle exception
		}
	}
	
	public synchronized void methodB() {
		Thread thread=Thread.currentThread();
		System.out.println(thread.getName()+":method B 작업실행");
		notify();
		
		try { wait();}//정지하기
		catch (InterruptedException e) {
			// TODO: handle exception
		}
		
		
	}
}
