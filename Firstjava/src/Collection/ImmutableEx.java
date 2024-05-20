package Collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ImmutableEx {
	
		
		public static void main(String[] args) {

			
			List<String> listimmut=List.of("A","B","C");
			Set<String> setimmut=Set.of("A","B","C");
			
			
			Set<String> set=new HashSet<String>();
			set.add("A");
			set.add("B");
			set.add("C");
			set.add("D");
			Set<String> setimmut2=Set.copyOf(set);
			
			//구현객체로 만들 수 있을 거 같아
	        Set<String> customImmutableSet = Set.copyOf(Set.of("apple", "banana", "cherry"));

			
			
		}

}
