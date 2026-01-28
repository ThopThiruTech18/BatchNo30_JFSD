package in01.collections.stack;

import java.util.Stack;

public class Example01 {
	
	public static void main(String[] args) {
		
		Stack stack=new Stack<>();
		
		stack.push(10);
		stack.push(5);
		stack.push(8);
		stack.push(9);
		
		System.out.println(stack);
		
		stack.pop();
		System.out.println(stack);
		
		stack.pop();
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		
	}

}
