package Thread;

public class CalcThread extends Thread {

	public CalcThread(String name) {
		setName(name);
	}
	public void run() {
		//시간 지연
		int i;
		for(i=0;i<20000000;i++) {
			for(int j=0;j<234;j++) {
		}			}System.out.println(getName());

	}
}
