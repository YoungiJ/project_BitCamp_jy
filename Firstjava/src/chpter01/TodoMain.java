//package chpter01;
//
//import java.util.Scanner;
//
//public class TodoMain {
//	
//	static String group;
//	
//	public static void main(String[]args) {
//		Scanner sc=new Scanner(System.in);
//		
//		//t1-> ������ todolist
//		TodoList t1=new TodoList();
//		
//		while(true) {
//			
//			
//			System.out.println("----------TODO MATE----------");
//		    System.out.println(">>1.�� �� �߰�");
//		    System.out.println(">>2.�� �� ����");
//		    System.out.println(">>3.�� �� ����");
//		    System.out.println(">>4.��� �� �� ����");
//		    System.out.println(">>5.���� ���� �ؾ�����");
//		    System.out.println(">>6.���α׷� ����");
//			int key=sc.nextInt();
//
//
//		switch (key) {
//		//1. �߰�
//
//		case 1:
//			t1.addList();
//			break;
//		//2.����
//
//		case 2:
//		    System.out.print(">> ������ group: ");
//			group=sc.next();
//			t1.deleteList(group);
//
//			
//			
//			break;
//			
//		//3.����
//
//		case 3:
//		    System.out.print(">> ������ group: ");
//			group=sc.next();
//			t1.editList(group);
//			break;
//			
//		//4.���
//		case 4:
//			t1.printAll();
//
//			break;
//		//5. ���� �����ؾ��� ��
//		case 5:
//			t1.priority();
//			return;
//			
//			
//			
//		default:
//			break;
//		}
//		
//		}
//	}
//}
