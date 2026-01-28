package in01.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Example {
	
	public static void main(String[] args) {
		
//		Set hSet=new HashSet();  //16		 //Random order based on the hasing technique
//		Set lLet=new LinkedHashSet();    //Insertion Order
//		Set tSet=new TreeSet();      //Sorted(Ascending order)
		
		
		
		
		Set hSet=new TreeSet();
		hSet.add(10);   //10,50,89
		hSet.add(50); //Integer
		hSet.add(89);
 		hSet.add(70);
//		hSet.add(null);
 		hSet.add(true); //Boolean
		
		
		System.out.println(hSet);
		
		
		
		
	}

}
