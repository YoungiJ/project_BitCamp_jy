package Thread2;


public class User2Thread extends Thread{
	
	private Cal calculator;
	
	public User2Thread(String name) {
		// TODO Auto-generated constructor stub
		setName(name);
	}
	//������ü�� ���� ���� �ͼ� �� thread1
	public void setCalculator(Cal calculator) {
		this.calculator = calculator;
	}
	@Override
	public void run() {
		calculator.setMemory(1000);
	}
	
}
