package in01.collections.typesofcollections;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFastCollections {

	public static void main(String[] args) {

		
		//Fail Fast collection
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		Iterator<Integer> iterator = list.iterator();

		while (iterator.hasNext()) {
			
			list.add(100);
			System.out.println(iterator.next());
		}

	}

}
