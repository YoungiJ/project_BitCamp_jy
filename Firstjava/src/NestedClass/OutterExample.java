package NestedClass;


public class OutterExample {
	
	public static void main(String[]args) {
		
		Outter outter=new Outter();
		Outter.Nested nested=outter.new Nested();//바깥클래스를 만들어야(이미 outter로 만듬)
		//Outter.nested nested=new Outter.nested();
		
		nested.print();
	}
	
}
