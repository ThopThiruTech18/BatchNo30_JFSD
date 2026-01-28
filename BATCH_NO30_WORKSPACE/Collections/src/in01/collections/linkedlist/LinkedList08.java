package in01.collections.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList08 {
	
	public static void main(String[] args) {
		
		LinkedList list=new LinkedList();
		list.add("hari");  //node-1
		list.add("vinay");  //node-2
		list.add("chandu");  //node-3
		list.add("ram");  //node-4
		
		Iterator iterator = list.iterator();
		
		while(iterator.hasNext())
		{
			
			System.out.println(iterator.next());
		}
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
	}

}
