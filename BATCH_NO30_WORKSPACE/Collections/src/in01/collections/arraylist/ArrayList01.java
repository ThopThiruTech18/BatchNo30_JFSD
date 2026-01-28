package in01.collections.arraylist;

import java.util.ArrayList;

public class ArrayList01 {
	
	public static void main(String[] args) {
		
		
		ArrayList list=new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(20);
//		list.remove(4);
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		System.out.println(list.contains(100));
		System.out.println(list.indexOf(50));
		System.out.println(list.indexOf(20));
		System.out.println(list.lastIndexOf(20));
		
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		System.out.println(list.get(5));
		
		
	}

}
