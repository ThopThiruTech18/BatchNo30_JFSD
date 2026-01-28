package in01.collections.queue;

import java.util.ArrayDeque;

public class ArrayDeque01 {

	public static void main(String[] args) {
		
		
		ArrayDeque dq=new ArrayDeque<>();
		
		dq.add(10);
		dq.add(50);
		dq.add(60);
		dq.add(15);
		dq.add(12);
		
		
		System.out.println(dq.peekLast());

		
	}

}
