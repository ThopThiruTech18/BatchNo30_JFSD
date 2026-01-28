package in01.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Spliterator;

public class Example04 {

	public static void main(String[] args) {

		ArrayList list1 = new ArrayList();

		list1.add(10);
		list1.add(40);
		list1.add(20);
		list1.add(30);
		list1.add(35);
		list1.add(25);
		list1.add(6);
		

	 System.out.println("-------------------1)for loop-------------------");
	for (int i = 0; i < list1.size(); i++) {
		
		System.out.println(list1.get(i));
		
	}

		

		
		

	}

}
