package Lamda;

public class MethodReferenceEx {
	public static void main(String[]args) {
		
		//참조객체 String::compareTo 
		Person3 person3=new Person3();
		//람다식-> 구현 객체
		//구현 메서드 ->왜 compare 구현안함??-> compareToIgnoreCase로 구현했자나!!!
		person3.ordering(String::compareToIgnoreCase);
		
		
		
		
	}


}
