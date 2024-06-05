package ArrayListProject;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SmartPhone {
	Scanner in = new Scanner(System.in);
	int numCount=0;

	//arraylist 구현
	List<Addr> list=new LinkedList<Addr>();

	// input
	public Addr inputContactData() {
		System.out.print("이름 :");
		String name = in.nextLine();
		System.out.print("전화번호:");
		String phoneNumber = in.nextLine();
		System.out.print("이메일 :");
		String email = in.nextLine();
		System.out.print("주소 :");
		String address = in.nextLine();
		System.out.print("그룹(친구/가족) :");
		String group = in.nextLine();
		
		return new Addr(name, phoneNumber, email, address, group) ;
		
	}
	
	// add
	public void addAddr(Addr addr) {
		list.add(addr);
		numCount++;
		System.out.println(">>> 데이터가 저장되었습니다.");
		
	}
	
	//search
	public void searchAddr(String name) {
		//list에서 똑같은 이름찾기
		for(Addr li:list) {
			if(li.getName().equals(name)){
				printAddr(li);
			}
		}
	}
	//delete 
	public void deleteAddr(String name) {
		for(Addr li:list) {
			if(li.getName().equals(name)){
				list.remove(li);
				numCount--;
			}
		}
	}
	
	
	//edit
	public void editAddr(String name, Addr addr) {
		for(int i=0;i<numCount;i++) {
			if(list.get(i).getName().equals(name)){
				list.set(i, addr);
			}
		}
		
	}
	
	//print
	public void printAddr(Addr addr) {
		System.out.println("이름 :" + addr.getName());
		System.out.println("전화번호:" + addr.getPhoneNumber());
		System.out.println("이메일 :" + addr.getEMail());
		System.out.println("주소 :" + addr.getAddress());
		System.out.println("그룹(친구/가족) :" + addr.getGroup());
		System.out.println("==================================");
	}

	//print All
	public void printAllAddr() {
		for(Addr li:list) {
			printAddr(li);
			}
		
	}
}