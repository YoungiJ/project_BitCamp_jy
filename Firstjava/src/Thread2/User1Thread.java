package Thread2;


public class User1Thread extends Thread{
	
	private Cal calculator;
	
	public User1Thread(String name) {
		// TODO Auto-generated constructor stub
		setName(name);
	}
	//������ü�� ���� ���� �ͼ� �� thread1
	public void setCalculator(Cal calculator) {
		this.calculator = calculator;
	}
	@Override
	public void run() {
		calculator.setMemory(400);
	}
	
}
