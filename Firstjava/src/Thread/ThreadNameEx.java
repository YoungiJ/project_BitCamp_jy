package Thread;

public class ThreadNameEx {
	public static void main(String[] args) {
		
		//현재 쓰레드
		Thread mainThread=Thread.currentThread();
		System.out.println(mainThread);
	
		ThreadA threadA=new ThreadA();
		System.out.println("쓰레드 이름"+threadA.getName());//생성자에서 set을 했으니까 이름 출력
		threadA.start();

		ThreadB threadB=new ThreadB();
		System.out.println("쓰레드 이름"+threadB.getName());
		threadB.start();//이름을 따로 넣지 않으면 Thread-1 숫자가 뒤에 붙어서 출력됨
		//아 시간 왤캐 안가냐
	}
}
