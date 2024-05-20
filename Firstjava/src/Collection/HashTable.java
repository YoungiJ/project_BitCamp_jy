package Collection;


import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTable {
	
	public static void main(String[] args) {
		//HashTable생성
		
		Map<String, Integer> map=new Hashtable<>();
		
		//Thread-> 쓰레드를 생성해서 map에 값을 집어넣음
		Thread th1=new Thread() {
			@Override
			public void run() {
				for(int i=0;i<10;i++) {
					map.put(String.valueOf(i),i);//기본 타입을 문자 열로 변환
					
				}
			}
			
			
		};
		//Thread-> 쓰레드를 생성해서 map에 값을 집어넣음
		Thread th2=new Thread() {
			@Override
			public void run() {
				for(int i=0;i<20;i++) {
					map.put(String.valueOf(i),i);//기본 타입을 문자 열로 변환
					
				}
			}
			
			
		};
		
		th1.start();
		th2.start();//t1이 hashtable에 값을 다 넣을때까지 th2가 join때문에 정지됨
		
		try {
			th1.join();//일시 정지
			th2.join();//일시 정지
		}catch (Exception e) {
			// TODO: handle exception
		}
		//저장된 총 엔트리수 얻기
		int size=map.size();//<- t2가덮어씀
		System.out.println(size);
		
		


	
	}
}
