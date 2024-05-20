package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListEx {
	public static void main(String[] args) {
	
//	String[] arr= {"홍","신","감"};
//	List<String> li=Arrays.asList(arr);
//	li.add("황");
//	for(String name:li) {
//		System.out.println(name);
//	}
		
	List<String> list1=new ArrayList<String>();
	List<String> list2=new LinkedList<>();
	
	long startTime;
	long endTime;
	
	startTime=System.nanoTime();
	for(int i=0;i<10000;i++) {
		list1.add(0,String.valueOf(i));
	}
	endTime=System.nanoTime();
	System.out.println("Arraylist걸린시간: "+" "+(endTime-startTime));
	
	
	startTime=System.nanoTime();
	for(int i=0;i<10000;i++) {
		list2.add(0,String.valueOf(i));
	}
	endTime=System.nanoTime();
	System.out.println("Arraylist걸린시간: "+" "+(endTime-startTime));
	
	}
}
