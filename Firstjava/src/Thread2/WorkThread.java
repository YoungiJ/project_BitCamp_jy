package Thread2;

public class WorkThread extends Thread{
	
	
	private String name;
	boolean work=true;
	public WorkThread(String name) {
		// TODO Auto-generated constructor stub
		setName(name);
	}
	@Override
	public void run() {
		if(work) {
			System.out.println(getName()+"작업처리중");
			
		}else {
			Thread.yield();
		}
	}
	
}
