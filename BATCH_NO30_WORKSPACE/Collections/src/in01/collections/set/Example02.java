package in01.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Example02 {
	
	public static void main(String[] args) {
		
//		Set hSet=new HashSet();  //16		 //Random order based on the hasing technique
//		Set lLet=new LinkedHashSet();    //Insertion Order
//		Set tSet=new TreeSet();      //Sorted(Ascending order)
		
		
		
		
		Set hSet=new HashSet(); //16,12,13-->32
		hSet.add(10);   //10,50,89
		hSet.add(20);
		hSet.add(30);
 		hSet.add(40);
 		
 		hSet.add(50);   //10,50,89
		hSet.add(60);
		hSet.add(70);
 		hSet.add(80);
 		
 		hSet.add(90);   //10,50,89
		hSet.add(100);
		hSet.add(110);
 		hSet.add(70);
 		
 		hSet.add(130);   //10,50,89
 		
 		
 		
		hSet.add(140);
		hSet.add(89);
 		hSet.add(120);
		
		
		
		
		
		
	}

}
