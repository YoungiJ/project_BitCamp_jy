package Collection;


import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTable {
	
	public static void main(String[] args) {
		//HashTable����
		
		Map<String, Integer> map=new Hashtable<>();
		
		//Thread-> �����带 �����ؼ� map�� ���� �������
		Thread th1=new Thread() {
			@Override
			public void run() {
				for(int i=0;i<10;i++) {
					map.put(String.valueOf(i),i);//�⺻ Ÿ���� ���� ���� ��ȯ
					
				}
			}
			
			
		};
		//Thread-> �����带 �����ؼ� map�� ���� �������
		Thread th2=new Thread() {
			@Override
			public void run() {
				for(int i=0;i<20;i++) {
					map.put(String.valueOf(i),i);//�⺻ Ÿ���� ���� ���� ��ȯ
					
				}
			}
			
			
		};
		
		th1.start();
		th2.start();//t1�� hashtable�� ���� �� ���������� th2�� join������ ������
		
		try {
			th1.join();//�Ͻ� ����
			th2.join();//�Ͻ� ����
		}catch (Exception e) {
			// TODO: handle exception
		}
		//����� �� ��Ʈ���� ���
		int size=map.size();//<- t2�����
		System.out.println(size);
		
		


	
	}
}
