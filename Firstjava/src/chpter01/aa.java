package chpter01;

import java.util.Scanner;

public class aa {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("정수값:");
		int num1=in.nextInt();
		for(int i = num1; i>0;i--) {
			i=num1*(num1--);
			System.out.println("1부터"+num1+"까지의 곱은"+(i));
			}
		
		

	}

}
