//package chpter01;
//
//import java.util.Scanner;
//
//public class ArrayTest {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		Scanner sc=new Scanner(System.in);
//	
//		Member[] m1=new Member[2];
//		
//		for (int i = 0; i < m1.length; i++) {
//		    m1[i] = new Member(); // 각 배열 요소 초기화
//		}
//		
//		for(int i=0;i<m1.length;i++) {
//			System.out.println('\n');
//			System.out.print("이름:");
//			m1[i].name=sc.next();
//			
//			System.out.print("아이디:");
//			m1[i].id=sc.nextInt();
//			
//			System.out.print("나이:");
//			m1[i].age=sc.nextInt();
//			
//			System.out.print("학교:");
//			m1[i].university=sc.next();
//		
//		}
////		m1[0]=new Member("황지영",202134750,23,"gachon");
////		m1[1]=new Member("홍길동",202134740,53,"korea");
////		m1[2]=new Member("아이유",202134730,33,"seoul");
////		m1[3]=new Member("이현지",202134720,23,"gachon");
////		m1[4]=new Member("박우진",202134710,24,"kaist");
//		
//		System.out.println('\n');
//		for(int i=0;i<m1.length;i++) {
//			System.out.printf("name: %s, id: %d,age: %d, university: %s",
//					m1[i].name,m1[i].id,m1[i].age,m1[i].university);
//			System.out.println();
//			
//		}
//	}
//
//}
