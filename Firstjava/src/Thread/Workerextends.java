package Thread;
//반드시 메인 쓰레드에서 thread객체 만들어서 start 호출해야함
//불편한 1번 방법
public class Workerextends extends Thread{
	@Override
	public void run() {
		System.out.println("자식객체 실행!");
			}
}
