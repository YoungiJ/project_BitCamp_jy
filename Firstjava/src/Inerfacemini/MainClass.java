package Inerfacemini;

public class MainClass {

	public static void main(String[]args) {
		
		//°´Ã¼ »ý¼º
		IFunction func;
		
		System.out.println("A phone");
		func=new APhone();
		func.call();
		func.fast();
		func.tvRemote();

		System.out.println("-----------------------------");

		System.out.println("B phone");
		func=new BPhone();
		func.call();
		func.fast();
		func.tvRemote();
		
		System.out.println("-----------------------------");

		System.out.println("C phone");
		func=new CPhone();
		func.call();
		func.fast();
		func.tvRemote();
	}
}
