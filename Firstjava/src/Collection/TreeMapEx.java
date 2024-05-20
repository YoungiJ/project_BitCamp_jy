package Collection;

import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapEx {
	
	public static void main(String[] args) {
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		
		treeMap.put("apple", 10);
		treeMap.put("applq", 60);
		treeMap.put("applw", 40);
		treeMap.put("applsd", 50);
		treeMap.put("applg", 80);
		treeMap.put("applb", 20);
		
		Set<Entry<String, Integer>> entrySet = treeMap.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + "-" + entry.getValue());
		}
		
		Entry<String, Integer> firstEntry = treeMap.firstEntry();
		if (firstEntry != null) {
			System.out.println("첫 번째 엔트리: " + firstEntry.getKey() + "-" + firstEntry.getValue());
		} else {
			System.out.println("트리맵이 비어있습니다.");
		}
	}
}
