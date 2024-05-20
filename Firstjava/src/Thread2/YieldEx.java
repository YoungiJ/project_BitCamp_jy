package Thread2;

public class YieldEx {
	public static void main(String[]args) {

	WorkThread workThread1=new WorkThread("threadA");
	WorkThread workThread2=new WorkThread("threadB");
	workThread1.start();
	workThread2.start();
	
	try {
		Thread.sleep(5000000);
	}catch (InterruptedException e) {
		// TODO: handle exception
			workThread1.work=false;	}
	
	try {
		Thread.sleep(10000000);
	}catch (InterruptedException e) {
		// TODO: handle exception
			workThread1.work=true;	}
}
}