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
//	//�迭����
//	public TodoList() {
//		// TODO Auto-generated constructor stub
//	}
//	
//	Todo[] todo=new Todo[5];
//	 
//	
//	//����
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
//	//�ٺ���
//	void printAll() {
//		for(Todo what:this.todo) {
//			if(what!=null)//nullpointerexception ����
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
//	//1. �߰�
//	void addList() {
//		Todo what=new Todo();
//		todo[counter]=editList(what);
//		counter++;
//	}
//	
//	
//	
//	//2.����
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
//	//3.����
//	void editList(String group) {
//		//group ���Ե� -> what�� ��ȯ
////		Todo what=findSomthing(group);
//		int index=findIndex(group);
//
//		System.out.print("���ο� ����: ");
//		todo[index].setTitle(sc.next());
//		sc.nextLine();
//		
//		System.out.print("���ο� ������: ");
//		todo[index].setDetail(sc.nextLine());
//		
//		System.out.print("���ο� ��¥: ");
//		todo[index].setDue(sc.next());
//		
//		System.out.print("���ο� �з�: ");
//		todo[index].setGroup(sc.next());
//		
//		System.out.print("���ο� �߿䵵: ");
//		todo[index].setImportant(sc.nextInt());
//		//�ε����� ã�ƶ�
//	
//	}
//	//3.���� overload List��
//	Todo editList(Todo what) {
//		
//		System.out.print("����: ");
//		what.setTitle(sc.next());
//		sc.nextLine();
//		
//		System.out.print("������: ");
//		what.setDetail(sc.nextLine());
//		
//		System.out.print("��¥: ");
//		what.setDue(sc.next());
//		
//		System.out.print("�з�: ");
//		what.setGroup(sc.next());
//		
//		System.out.print("�߿䵵(����): ");
//		what.setImportant(sc.nextInt());
//		return what;
//	}
//	//4. ã�� �޼���
//	Todo findSomthing(String group) {
//		int i;
//		for(i=0;i<counter;i++) {
//		if(todo[i].getGroup().contains(group)) {
//			System.out.println(group+"�� ���Ե� todo�� ã�ҽ��ϴ�.");
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
//			System.out.println(group+"�� index�� ã�ҽ��ϴ�.");
//		}}
//		
//				return index;
//	}
//	//5. �켱���� �޼���
//	
//	//Ŭ���� ����
//	
//	
//	void priority() {
//		ImportArr[] importantArr=new ImportArr[counter];
//		//�߿䵵�� sorting �ؼ� -> ���� ū ������� ������������ ����ϱ�\
//		for(int i=0;i<counter;i++) {
//			importantArr[i] = new ImportArr(); // ���⼭ ��ü ����***nullpointererre
//
//			importantArr[i].title=todo[i].getTitle();
//			importantArr[i].rank=todo[i].getImportant();
//
//		}
//		//rank��� sorting �ϱ�
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
//		//�߿䵵�� ���� ��� ���
//		for(int i=0;i<counter;i++) {
//			System.out.println(importantArr[i].title+"�� �߿䵵:"+(importantArr[i].rank));
//
//		}
// 
//	}
//	
//	
//}
