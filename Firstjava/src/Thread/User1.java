package Thread;

public class User1 extends Thread{
	private Cal calcul;
	
	public void setCalcul(Cal calcul) {
		this.setName("Name1");
		this.calcul=calcul;
	}
	
	@Override
	public void run() {
		calcul.setMemory(100);
	}

}
