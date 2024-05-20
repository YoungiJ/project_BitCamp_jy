package Prac;

import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx {
	
	public static void main(String[] args) {
		
		TreeMap<String,Integer> treemap=new TreeMap<>();
		//엔트리저장
		treemap.put("apple",10);
		treemap.put("base",20);
		treemap.put("cherry",30);
		treemap.put("ever",50);

		
		//정렬된 엔트리 하나씩 가져오기
		Set<Map.Entry<String,Integer>> keyset=treemap.entrySet();
		for(Entry<String, Integer> entry: keyset) {
			String key=entry.getKey();
			Integer value=entry.getValue();
			System.out.println(key+" "+value);

			
		}
		System.out.println();

		//특정 키에 대한 값 가져오기
		Entry<String,Integer> entry=null;
		entry=treemap.firstEntry();
		System.out.print("제일앞단어:");

		System.out.println(entry.getKey()+" "+entry.getValue());

		System.out.println();

		//내림차순으로 정렬하기
		NavigableMap<String,Integer> descendingMap=treemap.descendingMap();
		//엔트리셋 저장하기
		 Set<Entry<String,Integer>> entryset=descendingMap.entrySet();
		 for(Entry<String,Integer> en:entryset) {
			 
			String key=en.getKey();
			Integer value=en.getValue();
			System.out.println(key+" "+value);
			
		 }
		System.out.println();

		//범위 검색
		 NavigableMap<String,Integer> rangeMap=treemap.subMap("c",true,"h",false);
		 for(Entry<String,Integer> en:rangeMap.entrySet()) {
			 
				
				System.out.println(en.getKey()+" "+en.getValue());
				
			 } 
	
	}

}
