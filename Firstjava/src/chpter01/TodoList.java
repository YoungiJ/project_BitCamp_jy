//package chpter01;
//import java.util.Scanner;
//
//
//class ImportArr{
//	String title;
//	int rank;
//	
//	public ImportArr() {
//		// TODO Auto-generated constructor stub
//		this.title=null;
//		this.rank=0;
//
//		
//	}
//	
//	
//}
//public class TodoList {
//
//	static int counter;
//	Scanner sc=new Scanner(System.in);
//
//	//배열선언
//	public TodoList() {
//		// TODO Auto-generated constructor stub
//	}
//	
//	Todo[] todo=new Todo[5];
//	 
//	
//	//보기
//	void print(Todo what) {
////		Todo what=new Todo();
//		System.out.println(what.getTitle());
//		System.out.println(what.getDetail());
//		System.out.println(what.getDue());
//		System.out.println(what.getGroup());
//		System.out.println(what.getImportant());
//		
//	}
//	
//	
//	//다보기
//	void printAll() {
//		for(Todo what:this.todo) {
//			if(what!=null)//nullpointerexception 방지
//			{
//				print(what);
//				System.out.println();
//
//			}
//		}
//	}
//	
//	
//	
//	//1. 추가
//	void addList() {
//		Todo what=new Todo();
//		todo[counter]=editList(what);
//		counter++;
//	}
//	
//	
//	
//	//2.삭제
//		
//	void deleteList(String group) {
//			findSomthing(group);
//			for(int j=0;j<counter;j++) {
//				todo[j]=todo[j+1];
//			}
//			counter--;
//			
//		}
//	
//	//3.수정
//	void editList(String group) {
//		//group 포함된 -> what을 반환
////		Todo what=findSomthing(group);
//		int index=findIndex(group);
//
//		System.out.print("새로운 제목: ");
//		todo[index].setTitle(sc.next());
//		sc.nextLine();
//		
//		System.out.print("새로운 디테일: ");
//		todo[index].setDetail(sc.nextLine());
//		
//		System.out.print("새로운 날짜: ");
//		todo[index].setDue(sc.next());
//		
//		System.out.print("새로운 분류: ");
//		todo[index].setGroup(sc.next());
//		
//		System.out.print("새로운 중요도: ");
//		todo[index].setImportant(sc.nextInt());
//		//인덱스를 찾아라
//	
//	}
//	//3.수정 overload List용
//	Todo editList(Todo what) {
//		
//		System.out.print("제목: ");
//		what.setTitle(sc.next());
//		sc.nextLine();
//		
//		System.out.print("디테일: ");
//		what.setDetail(sc.nextLine());
//		
//		System.out.print("날짜: ");
//		what.setDue(sc.next());
//		
//		System.out.print("분류: ");
//		what.setGroup(sc.next());
//		
//		System.out.print("중요도(정수): ");
//		what.setImportant(sc.nextInt());
//		return what;
//	}
//	//4. 찾기 메서드
//	Todo findSomthing(String group) {
//		int i;
//		for(i=0;i<counter;i++) {
//		if(todo[i].getGroup().contains(group)) {
//			System.out.println(group+"이 포함된 todo를 찾았습니다.");
//		}}
//		
//		
//		System.out.println("return todo");
//		return todo[i];
//	}
//	int findIndex(String group) {
//		int index=0,i;
//		for(i=0;i<counter;i++) {
//		if(todo[i].getGroup().contains(group)) {
//			System.out.println(group+"의 index를 찾았습니다.");
//		}}
//		
//				return index;
//	}
//	//5. 우선순위 메서드
//	
//	//클래스 생성
//	
//	
//	void priority() {
//		ImportArr[] importantArr=new ImportArr[counter];
//		//중요도를 sorting 해서 -> 가장 큰 순서대로 내림차순으로 출력하기\
//		for(int i=0;i<counter;i++) {
//			importantArr[i] = new ImportArr(); // 여기서 객체 생성***nullpointererre
//
//			importantArr[i].title=todo[i].getTitle();
//			importantArr[i].rank=todo[i].getImportant();
//
//		}
//		//rank대로 sorting 하기
//		
//		for(int i=0;i<counter-1;i++) {
//			  int min = i;
//
//			for(int j=i+1;j<counter;j++) {
//			if(importantArr[j].rank>importantArr[min].rank){	
//				min=j;
//			}
//				int temp;
//				temp=importantArr[i].rank;
//				importantArr[i]=importantArr[min];
//				importantArr[min]=temp;
//			
//				
//				
//			}
//			
//
//		}
//		//중요도가 높은 대로 출력
//		for(int i=0;i<counter;i++) {
//			System.out.println(importantArr[i].title+"의 중요도:"+(importantArr[i].rank));
//
//		}
// 
//	}
//	
//	
//}
