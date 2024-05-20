package API2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;


import chpter01.Cal;

public class Boxing {
	public static void main(String[]args) throws ClassNotFoundException{

	//아예 지원을 안해주진 않음 -> deprecated
//		Integer integer=Integer.valueOf(100);
//		System.out.println(integer);
//	
		
//		String data="자바";
//		
//		byte[] bytes=data.getBytes();
//		System.out.println(Arrays.toString(bytes));
//		
//		String str1=new String(bytes);
//		System.out.println(str1);
		
		
//		StringBuilder data=new StringBuilder();
//		data.append("wer");
//		System.out.println(data);
//
//		data.insert(2,"s");
//		System.out.println(data);
//
//		data.delete(1,3);
//		System.out.println(data);
//
//		data.toString();
//		System.out.println(data);
		
		
//		String data="지영이가,배고파서&쓰러졌어요";
//		String[] token=data.split(",|&");
//		for(String arr: token) {
//			System.out.println(arr);
//		}
//		String datas="지영이가,배고파서&쓰러졌어요";
//		StringTokenizer stringTokenizer=new StringTokenizer(datas,",||&");
//		System.out.println(stringTokenizer);
//		while(stringTokenizer.hasMoreTokens()) {
//			System.out.println(stringTokenizer.countTokens());
//
//			String tokesn=stringTokenizer.nextToken();
//			System.out.println(tokesn);
//		}
		
		
		
		Date now=new Date();
		String now2=now.toString();
		System.out.println(now2);
		
		 SimpleDateFormat now3=new SimpleDateFormat("yyyy.MM.dd HH:");
		 String now4=now3.format(now);
		 System.out.println(now4);
		
		 TimeZone timeZone=TimeZone.getTimeZone("America/Los_Angeles");
		 
		
		Calendar calendar=Calendar.getInstance(timeZone);//캘린더의 하위 객체를 가져옴
		
		int am=calendar.get(Calendar.AM_PM);
		int year=calendar.get(Calendar.HOUR);
		System.out.println(am==calendar.AM);
		
		
		//아 배고파
		Class clazz=String.class;//클래스로 부터 객체를 얻는 방법
		Class clazz2=Class.forName("java.lang.String");//클래스로 부터 객체를 얻는 방법
		String sed="김자바";
		Class clazz3=sed.getClass();//객체로 부터 객체를 얻는 방법
		
		System.out.println(clazz);
		System.out.println(clazz2);
		System.out.println(clazz3);
		
		System.out.println(clazz.getPackage().getName());
		System.out.println(clazz2.getSimpleName());
		System.out.println(clazz3.getName());
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy년 MM월 dd일");
		String strDate=sdf.format(new Date());
		
		System.out.println(strDate);

	}
}
