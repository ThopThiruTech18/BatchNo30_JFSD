package in.nextit.operators;

public class No04UneryOperators {

	public static void main(String[] args) {

//		 4) Unery Operator
//	[1)Increment(1)Pre-Increment(+ b+a),2)Post Increment(a++), 
//	2) Decrement(1)Pre-Decrement(--a),2)Post Decrement(a--), 

//	[1)Increment(1)Pre-Increment(++a),2)Post Increment(a++), 
		// pre--> It will increment/decrement by 1  in the same line.
		// post--> It will increment/decrement by 1  in the next line.
		int a = 10;
//		System.out.println(++a);// 11
//		System.out.println(++a);// 12
//		System.out.println(a++);// 12
//		System.out.println(++a);// 12+1+1=14
//		System.out.println(a++);// 14
//		System.out.println(a++);// 15
//		System.out.println(++a);// 15+1+1=17
		
		
		System.out.println(--a);// 9
		System.out.println(--a);// 8
		System.out.println(a--);// 8
		System.out.println(--a);// 8-1-1=6
		System.out.println(a--);// 6
		System.out.println(a--);// 5
		System.out.println(a--);// 4
		System.out.println(a--);// 3

	}

}
