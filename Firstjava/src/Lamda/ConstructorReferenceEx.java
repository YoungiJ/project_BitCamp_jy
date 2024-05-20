package Lamda;

public class ConstructorReferenceEx {
	public static void main(String[]args) {
		
		
		Person2 p2=new Person2();
		//람다식 구현
		Member m1=p2.getMember1(Member::new);
		System.out.println(m1);
		System.out.println();
		
		//람다식 구현
		Member m2=p2.getMember2(Member::new);
		System.out.println(m2);
		System.out.println();
		
		
	}

}
