package Thread;

public class User2 extends Thread{
	private Cal calcul;
	
	public void setCalcul(Cal calcul) {
		this.setName("Name2");
		this.calcul=calcul;
	}
	
	@Override
	public void run() {
		calcul.setMemory(50);
	}

}
