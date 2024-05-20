package Lamda;

import java.util.ArrayList;
import java.util.List;


public class FIlteringEx {
	public static void main(String[]args) {
	
	List<String> list=new ArrayList<>();
	list.add("홍길동");
	list.add("홍길북");
	list.add("홍길동");
	list.add("홍길서");
	list.add("황지영");
	
	list.stream()
	.distinct()
	.forEach(n->System.out.println(n));
	System.out.println();
	
	list.stream()
	.filter(n->n.startsWith("홍"))
	.forEach(n->System.out.println(n));
	System.out.println();

	list.stream()
	.distinct()// 중복 제거
	.filter(n->n.startsWith("홍"))

	.forEach(n->System.out.println(n));

	
	
	}
}
