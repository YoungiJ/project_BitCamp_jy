package Thread2;

public class SynchronizedExample {
	public static void main(String[]args) {

		Cal cal=new Cal();//������ü
		User1Thread user1Thread=new User1Thread("threadAA");
		user1Thread.setCalculator(cal);
		user1Thread.start();
		
		
		User2Thread user2Thread=new User2Thread("thread�Ф�");
		user2Thread.setCalculator(cal);
		user2Thread.start();
		
	
		

		
		try {
			Thread.sleep(3000);
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("main end");
		
		
		
}}
