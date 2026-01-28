package in01.collections.vector;

import java.util.Enumeration;
import java.util.Vector;

public class Example03 {

	public static void main(String[] args) {

		Vector v1 = new Vector<>();
		v1.addElement(10); //0
		v1.addElement(20); //1
		v1.addElement(30); //2
		v1.addElement(40); //3
		v1.addElement(50); //4
		
		
		Enumeration elements = v1.elements();
		
		while(elements.hasMoreElements())
		{
			System.out.println(elements.nextElement());
		}
		
		
	
		
		

	}

}
