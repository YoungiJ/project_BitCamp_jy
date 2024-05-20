package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {
	
	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<>();
		//��ü ����
		map.put("����",1);
		map.put("����",2);
		map.put("����",3);
		map.put("����",4);
		System.out.println(map.size());
		//Ű�� => value ���
		int value=map.get("����");
		
		//Ű set�÷����� ��� �ݺ��ؼ� Ű�� ���� ���

		Set<String> keySet=map.keySet();//Key�� �޴� ����-> �길 �ߺ��ȵǸ� �ż�
		Iterator<String> keyIterator=keySet.iterator();
		while(keyIterator.hasNext()) {
			String nextString=keyIterator.next();// ���� Ű
			Integer nextInteger=map.get(nextString);
			System.out.println(nextString+" "+nextInteger);
			//�ؽ� �Լ��� ����ؼ� Ű�� �ؽ��ڵ带 ������� �����͸� ����-> ����� ������ ��� ������ �ٸ� �� ����
			
			
		}System.out.println();
		
		
		
		//�ѹ��� entry���� �ҷ��ͼ� �ݺ�����
		Set<Entry<String, Integer>> entrySet=map.entrySet();
		Iterator<Entry<String, Integer>> keyIterator2=entrySet.iterator();
		
		while(keyIterator2.hasNext()) {
			Entry<String,Integer> entry=keyIterator2.next();
			Integer numInteger=entry.getValue();
			String name=entry.getKey();
			System.out.println(numInteger+" "+name);
		}	
		//Ű�� ��Ʈ�� ����
		System.out.println();
		map.remove("����");
		System.out.println(map.size());
	
	}
	
	//Ű�� ��Ʈ�� ����


	
	
}
