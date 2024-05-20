package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {
	
	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<>();
		//객체 저장
		map.put("지영",1);
		map.put("지민",2);
		map.put("지현",3);
		map.put("지우",4);
		System.out.println(map.size());
		//키로 => value 얻기
		int value=map.get("지영");
		
		//키 set컬렉션을 얻고 반복해서 키와 값을 얻기

		Set<String> keySet=map.keySet();//Key만 받는 이유-> 얘만 중복안되면 돼서
		Iterator<String> keyIterator=keySet.iterator();
		while(keyIterator.hasNext()) {
			String nextString=keyIterator.next();// 다음 키
			Integer nextInteger=map.get(nextString);
			System.out.println(nextString+" "+nextInteger);
			//해시 함수를 사용해서 키의 해시코드를 기반으로 데이터를 관리-> 저장된 순서와 출력 순서가 다를 ㅅ 있음
			
			
		}System.out.println();
		
		
		
		//한번에 entry들을 불러와서 반복수행
		Set<Entry<String, Integer>> entrySet=map.entrySet();
		Iterator<Entry<String, Integer>> keyIterator2=entrySet.iterator();
		
		while(keyIterator2.hasNext()) {
			Entry<String,Integer> entry=keyIterator2.next();
			Integer numInteger=entry.getValue();
			String name=entry.getKey();
			System.out.println(numInteger+" "+name);
		}	
		//키로 엔트리 삭제
		System.out.println();
		map.remove("지영");
		System.out.println(map.size());
	
	}
	
	//키로 엔트리 삭제


	
	
}
