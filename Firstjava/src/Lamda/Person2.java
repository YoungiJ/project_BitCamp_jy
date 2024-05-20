package Lamda;

public class Person2 {
	//메서드 overloading
	public Member getMember1(Creatable1 c1) {
		String id="winter";
		Member m1=c1.create(id);
		return m1;
		
		
	}
	
	
	public Member getMember2(Creatable2 c2) {
		String id="winter";
		String name="한겨울";
		Member m1=c2.create(id,name);
		return m1;
		
		
	}


}
