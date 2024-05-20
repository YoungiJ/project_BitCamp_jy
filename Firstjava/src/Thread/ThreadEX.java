package Thread;

public class ThreadEX {
	public static void main(String[] args) {

	Cal cal=new Cal();
	
	User1 user1=new User1();
	user1.setCalcul(cal);
	user1.start();
	
	User2 user2=new User2();
	user2.setCalcul(cal);
	user2.start();



}
}