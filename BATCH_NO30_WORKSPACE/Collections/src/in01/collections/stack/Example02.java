package in01.collections.stack;

import java.util.Stack;

public class Example02 {
	
	public static void main(String[] args) {
		
		Stack stack=new Stack<>();
		
		stack.push(10);
		stack.push(5);
		stack.push(8);
		stack.push(9);
		
		System.out.println(stack.peek());
		System.out.println(stack.search(10));
		
		
		
	}

}
