package Generic;

public class BoundedType {
	public static void main(String[]arg) {
	
	
	int result=Util.compare(10,20);//앞에게 작으면 -1
	System.out.println(result);
	int result2=Util.compare(30,20);//앞에게 크면 1
	System.out.println(result2);
	int result3=Util.compare(20,20);//같으면0
	System.out.println(result3);
	
	}
}
