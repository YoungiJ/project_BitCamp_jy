package chpter01;

public class Calculator {
	//a,b를 재활용
	int a;
	int b;
		
	int add(int a, int b) {
		this.a=a;
		this.b=b;
		return a+b;
	}
	int minus(int a, int b) {
		this.a=a;
		this.b=b;
		return a-b;
	}
	int multi(int a, int b) {
		this.a=a;
		this.b=b;
		return a*b;
	}
	double divide(int a, int b) {
		this.a=a;
		this.b=b;
		return (double)a/b;
	}
}
