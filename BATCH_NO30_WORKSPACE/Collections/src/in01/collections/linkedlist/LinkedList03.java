package in01.collections.linkedlist;

import java.util.LinkedList;

public class LinkedList03 {
	
	public static void main(String[] args) {
		
		LinkedList list=new LinkedList();
		
		
		list.add(10);
		list.add(20);
		list.add(50);
		list.add(60);
		list.addFirst(100);
		list.addLast(200);
		
		//[100, 10, 20, 50, 60, 200]
		//  0    1   2   3   4   5
		
//		System.out.println(list.get(0));
		
//		System.out.println(list.getFirst());
//		System.out.println(list.getLast());
		
		System.out.println(list);
		System.out.println(list.removeFirst());
		System.out.println(list);
		System.out.println(list.removeLast());
		
		
		
		
		
	}

}
