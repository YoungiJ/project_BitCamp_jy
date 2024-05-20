package API;

import java.util.Properties;
import java.util.Set;

public class Time {
	public static void main(String[] args) {
		
//	long time1=System.nanoTime();	
//	long time2=System.nanoTime();
	String osName=System.getProperty("os.name");
	System.out.println(osName);
	String userName=System.getProperty("user.name");
	System.out.println(userName);
	
	String userHome=System.getProperty("user.home");
	System.out.println(userHome);
	
	
	
	Properties props=System.getProperties();
	Set keys=props.keySet();
	
	for(Object ob:keys) {
		if(ob instanceof Set) {
			String key=(String)ob;
			String valString=System.getProperty(key);
			System.out.println(key+" "+valString);
			
		}
		System.out.println(ob);
	}
	
	}
}
