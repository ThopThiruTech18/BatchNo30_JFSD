package in01.collections.linkedlist;

import java.util.ArrayDeque;
import java.util.LinkedList;

public class LinkedList01 {
	
	public static void main(String[] args) {
		
		LinkedList list=new LinkedList();

		list.add(10);  //node-1
		list.add(20);  //node-2
		list.add(30);  //node-3
		list.add(50);  //node-4
		list.add(50);  //node-5
	  	list.add(null);  //node-6
		list.add(null);  //node-7
		list.add(null);  //node-8
		list.add(null);  //node-9
		System.out.println(list.getLast());
		
		
	}

}
