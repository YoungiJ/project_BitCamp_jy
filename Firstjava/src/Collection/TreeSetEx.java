package Collection;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetEx {
	public static void main(String[] args) {
	
	TreeSet<Integer> treeSet=new TreeSet<>();
	
	treeSet.add(89);
	treeSet.add(98);
	treeSet.add(75);
	treeSet.add(95);
	treeSet.add(80);
	
	for(Integer s:treeSet) {
		System.out.println(s);//오름차순 정렬로 출력됨
	}
	System.out.println();

	System.out.println(treeSet.first());
	System.out.println(treeSet.last());
	System.out.println("lower");

	System.out.println(treeSet.lower(87));
	System.out.println("higher");

	System.out.println(treeSet.higher(34));
	System.out.println("floor");
	System.out.println(treeSet.floor(95));
	System.out.println(treeSet.ceiling(85)+'\n');
System.out.println();

	NavigableSet<Integer> rangeSet=treeSet.tailSet(80,true);
	System.out.println("rangeset");

	for(Integer s:rangeSet) {
		System.out.println(s);//오름차순 정렬로 출력됨
	}
	rangeSet=treeSet.subSet(80,true,90,false);//80이상 90이하
	System.out.println("subset");

	for(Integer s1:rangeSet) {
		System.out.println(s1);//오름차순 정렬로 출력됨
	}
	}
	
	
	
	
}
