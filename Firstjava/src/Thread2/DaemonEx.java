package Thread2;

public class DaemonEx {
	public static void main(String[]arg) {
	//주쓰레드의 보조 쓰레드를 생성-> 종속되기 때문에 주 쓰레드가 종료되면 데몬 쓰레드도 종료됨
	Daemon daemon=new Daemon();
//	daemon.setDaemon(true);//Daemon 객체를 -> 데몬 쓰레드로 만듦
	daemon.start();
	
	
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO: handle exception

	}	
//	Thread.interrupted();//메인쓰레드는 종료가 안됨?
	System.out.println("메인 스레드 종료");
	}

}
