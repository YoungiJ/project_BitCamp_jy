package NestedClass;


public class OutterExample {
	
	public static void main(String[]args) {
		
		Outter outter=new Outter();
		Outter.Nested nested=outter.new Nested();//�ٱ�Ŭ������ ������(�̹� outter�� ����)
		//Outter.nested nested=new Outter.nested();
		
		nested.print();
	}
	
}