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
//		//t1-> 지영의 todolist
//		TodoList t1=new TodoList();
//		
//		while(true) {
//			
//			
//			System.out.println("----------TODO MATE----------");
//		    System.out.println(">>1.할 일 추가");
//		    System.out.println(">>2.할 일 삭제");
//		    System.out.println(">>3.할 일 수정");
//		    System.out.println(">>4.모든 할 일 보기");
//		    System.out.println(">>5.지금 당장 해야할일");
//		    System.out.println(">>6.프로그램 종료");
//			int key=sc.nextInt();
//
//
//		switch (key) {
//		//1. 추가
//
//		case 1:
//			t1.addList();
//			break;
//		//2.삭제
//
//		case 2:
//		    System.out.print(">> 제거할 group: ");
//			group=sc.next();
//			t1.deleteList(group);
//
//			
//			
//			break;
//			
//		//3.수정
//
//		case 3:
//		    System.out.print(">> 수정할 group: ");
//			group=sc.next();
//			t1.editList(group);
//			break;
//			
//		//4.출력
//		case 4:
//			t1.printAll();
//
//			break;
//		//5. 지금 당장해야할 일
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
