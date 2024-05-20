package Thread2;

public class WaitNotifyEx {
	public static void main(String[]args) {
	
	WorkObject workObject=new WorkObject();
	
	WaitthreadA threadA=new WaitthreadA(workObject);
	WaitthreadB threadB=new WaitthreadB(workObject);
	
	threadA.start();
	threadB.start();
	
	
	}
}
