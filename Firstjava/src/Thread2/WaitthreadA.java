package Thread2;

public class WaitthreadA extends Thread{
	
	private WorkObject wbObject;
	public WaitthreadA(WorkObject wbObject) {
		// TODO Auto-generated constructor stub
		this.wbObject=wbObject;
	}
	
	
	@Override
	public void run() {//3
		
		for(int i=0;i<10;i++) {
			wbObject.methodA();
		}
		
	}
		
		
		
			
}
