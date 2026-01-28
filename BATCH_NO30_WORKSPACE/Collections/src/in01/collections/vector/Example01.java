package in01.collections.vector;

import java.util.Vector;

public class Example01 {

	public static void main(String[] args) {

		Vector v1 = new Vector<>();
		v1.addElement(10);
		v1.addElement(20);
		v1.addElement(30);
		v1.addElement(40);
		v1.addElement(50);
		System.out.println(v1);
		v1.removeElement(50);
		System.out.println(v1);

	}

}
