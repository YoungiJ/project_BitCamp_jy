//package chpter01;
//
//
//public class ChildExample {
//		public static void method1(Parent parent) {
//		// instanceOf ����� ���
//		if (parent instanceof Child) {
//			Child child=(Child)parent;	
//			System.out.println("m1 : parent -> child ��ȯ ����");
//
//		}else {
//			System.out.println("m1 : parent -> child ��ȯ ����");
//		}}
//
//		
//		public static void method2(Parent parent) {
//			// instanceOf ����� ���
//			
//			Child child=(Child) parent;	
//			System.out.println("m2 : parent -> child ��ȯ ����");}
//
//		
//		
//		public static void main(String[] args) {
//
//			Parent parentA=new Child();
//			method1(parentA);
//			method2(parentA);
//
//			Parent parentB=new Parent();
//			method1(parentB);
//			method2(parentB);
//		
//		}
//}
