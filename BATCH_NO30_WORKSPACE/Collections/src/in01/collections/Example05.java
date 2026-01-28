package in01.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Spliterator;

public class Example05 {

	public static void main(String[] args) {

		ArrayList list1 = new ArrayList();

		list1.add(10);
		list1.add(40);
		list1.add(20);
		list1.add(30);
		list1.add(35);
		list1.add(25);
		list1.add(6);
		
		System.out.println("-------------------2)for-each loop-------------------");

		for (Object object : list1) {
			System.out.println(object);

		}


		
		
		

		
		

	}

}
