package in01.collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Example03 {
	
	public static void main(String[] args) {
		
//		Map<Integer,String> map1=new HashMap<>();
//		Map<Integer,String> map2=new LinkedHashMap<>();
//		Map<Integer,String> map3=new TreeMap<>();
		
//		101 - John
//		102 - Smith
//		103 - David
//		104 - Robert
//		105 - Orlen

		
		
		Map<Integer,String> map1=new HashMap<>();
		map1.put(101, "John");
		map1.put(102, "Smith");
		map1.put(103, "David");
		map1.put(104, "Robert");
		map1.put(105, "Orlen");
		
		
		System.out.println(map1.containsKey(103));
		System.out.println(map1.containsKey(102));
		System.out.println(map1.containsKey(106));
		
		
	}

}
