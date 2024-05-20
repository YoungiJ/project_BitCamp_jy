package API;

public class EqualsEx {
	public static void main(String[]args) {
		
	
		//equals code
		Member ob1=new Member("blue");
		Member ob2=new Member("blue");
		Member ob3=new Member("red");
		
		System.out.println(ob1.equals(ob2));
		System.out.println(ob1.equals(ob3));
		
	}

}
