package HashMap_Project;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;


//Hashmap으로 바꾸기
// 키가 이름이고  value가 Addr임
//name넣는 걸 따로 만들어서 add할 때 쏙넣기
public class SmartPhone2 {

	Map<String,Addr2> hashmap;
	String name;
	
	int numOfCount = 0;
	Scanner in;

	public SmartPhone2() {

		hashmap=new HashMap<>();
		in = new Scanner(System.in);
	}

	public Addr2 inputContactData() {

		System.out.print("전화번호:");
		String phoneNumber = in.nextLine();
		System.out.print("이메일 :");
		String email = in.nextLine();
		System.out.print("주소 :");
		String address = in.nextLine();
		System.out.print("그룹(친구/가족) :");
		String group = in.nextLine();

		return new Addr2(phoneNumber, email, address, group);
	}
	
	
	public String inputName() {
		System.out.print("이름(key):");

		name=in.nextLine();
		return name;	
	}

	public void addAddr(Addr2 addr) {
		hashmap.put(inputName(),addr);//key
//		System.out.println(hashmap.get(list.get(numOfCount)));

		numOfCount++;
		System.out.println(">>> 데이터가 저장되었습니다.(" + numOfCount + ")");
	}

	public void printAddr(Addr2 addr) {
		System.out.println("이름"+name);
		System.out.println("전화번호:" + addr.getPhoneNumber());
		System.out.println("이메일 :" + addr.getEMail());
		System.out.println("주소 :" +  addr.getAddress());
		System.out.println("그룹(친구/가족) :" +  addr.getGroup());
		System.out.println("==================================");
	}

    public void printAllAddr() {
        for (Addr2 value : hashmap.values()) {
            printAddr(value);
        }
    	//key랑 value를 출력-> entrySet 생성
//    	Set<Entry<String, Addr>> entries=hashmap.entrySet();
//    	for(Entry<String,Addr> en:entries) {
//    		
//    		
//    	}
    	
    	
    	
    }

    public void searchAddr(String name) {
//        Addr value = hashmap.get(name);
//        if (value != null) {
//            printAddr(value);
//        } else {
//            System.out.println("검색 결과가 없습니다.");
//        }
    	if(hashmap.containsKey(name)) {
    		printAddr(hashmap.get(name));//addr
    	}
    }

	
    public void deleteAddr(String name) {
    	
    	if(hashmap.containsKey(name)) {
    		hashmap.remove(name);
	          numOfCount--;
	          System.out.println("삭제되었습니다.");
    	}else {
          System.out.println("검색 결과가 없습니다.");
      }
  }
    	
//    	Addr addr=hashmap.get(name);
//        if (hashmap.remove(name) != null) {
//            numOfCount--;
//            System.out.println("삭제되었습니다.");
//        } else {
//            System.out.println("검색 결과가 없습니다.");
//        }
    
	
    public void editAddr(String name, Addr2 newContact) {
    	hashmap.remove(name);
    	hashmap.put(inputName(),inputContactData());
    }
}
