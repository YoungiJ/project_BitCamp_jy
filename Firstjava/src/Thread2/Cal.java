package Thread2;

public class Cal {
	
	private int memory;
	
	public int getMemory() {return memory;}
	
	public void setMemory(int memory) {
		this.memory=memory;//1000(공유메모리에서 막 가져옴)
		try {
			Thread.sleep(3000);
		}catch (InterruptedException e) {System.out.println("예외");}
			// TODO: handle exception
			System.out.println(Thread.currentThread().getName()+":"+this.memory);
					
		
		
	}
	
	public void setMemory2(int memory) {
		this.memory=memory;//1000

		synchronized(this) {
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e) {System.out.println("예외");}
			System.out.println(Thread.currentThread().getName()+":"+this.memory);
					
		}
		
	}
}
