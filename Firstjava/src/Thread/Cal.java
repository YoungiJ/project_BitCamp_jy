package Thread;

public class Cal {
	
	private int memory;
	
	public int getMemory() {return memory;}
	
	public synchronized void setMemory(int memory) {
		this.memory=memory;
		try {
			Thread.sleep(3000);
		}catch (InterruptedException e) {System.out.println("¿¹¿Ü");}
			// TODO: handle exception
			System.out.println(Thread.currentThread().getName()+":"+this.memory);
					
		
		
	}
}
