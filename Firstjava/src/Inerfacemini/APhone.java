package Inerfacemini;

public class APhone implements IFunction {
	//override
	public void call() {
		System.out.println("전화가능합니다.");
	};
	public void fast() {
		
		System.out.println("불가능합니다.3G입니다.");
	};
	public void tvRemote() {
		System.out.println("미탑재되어있습니다..");

		
	};
	
}
