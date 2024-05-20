package Collection;
//hashtable�� �ڽ� Ŭ����

import java.io.IOException;
import java.util.Properties;

public class PropertiesEx {
	public static void main(String[] args) throws Exception {

//	driver=oracle.jdbc.OracleDriver
//	url=jdbc
	Properties properties=new Properties();

	properties.load(Properties.class.getResourceAsStream("database.properties"));
	

	String driver=properties.getProperty("driver");
	String adminString=properties.getProperty("admin");
	
	
	
	
	
	
	
	}

	

}
