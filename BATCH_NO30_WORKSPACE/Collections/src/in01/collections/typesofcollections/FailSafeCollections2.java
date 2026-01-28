package in01.collections.typesofcollections;

import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;


public class FailSafeCollections2 {

	public static void main(String[] args) {

		
		//Fail Fast collection
		ConcurrentHashMap<Integer,String> map = new ConcurrentHashMap<>();
		map.put(10,"A");
		map.put(20,"B");
		map.put(30,"C");
		map.put(40,"D");
		map.put(50,"E");
		
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		
		for (Entry<Integer, String> entry : entrySet) {
			
			map.put(100,"Z");
			
			System.out.println(entry);
			
		}
		
		
		

		
	}

}
