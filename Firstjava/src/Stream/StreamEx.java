package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import Lamda.Product;

public class StreamEx {
	public static void main(String[]args) {
	//list 컬렉션을 만들고 그 안에 product들을 채워넣음
		List<Product> list=new ArrayList<Product>();
		for(int i = 0;i<5;i++) {
			
			Product product=new Product(i,"상품"+i,"NCP", (int)(10000*Math.random()));
			list.add(product);
		}
		
		//객체 스트림 열기-> list니까 그냥 stream;
		
		Stream<Product> stream=list.stream();
		//객체를 하나 씩 처리
		stream.forEach(p->System.out.println(p));
	
	}
}
