package Lamda;


public class Person3 {
	public void ordering(Comparable comparable) {
		String aString="홍길자";
		String bString="홍길동";
		
		int result=comparable.compare(aString,bString);
		
		
	
	

//	public int compare(String aString,String bString) {}
		if(result<0) {System.out.println("a가 앞");}
		else if(result==0) {System.out.println("똑같");}
		else {System.out.println("b가 앞");}

	}
	
}
