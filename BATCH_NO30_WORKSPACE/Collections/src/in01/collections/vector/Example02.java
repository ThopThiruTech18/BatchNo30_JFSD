package in01.collections.vector;

import java.util.Vector;

public class Example02 {

	public static void main(String[] args) {

		Vector v1 = new Vector<>();
		v1.addElement(10); //0
		v1.addElement(20); //1
		v1.addElement(30); //2
		v1.addElement(40); //3
		v1.addElement(50); //4
		
		
		v1.insertElementAt(100, 3);
		System.out.println(v1);
		
		
		

	}

}
