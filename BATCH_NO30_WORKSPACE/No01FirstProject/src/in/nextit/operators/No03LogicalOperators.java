package in.nextit.operators;

public class No03LogicalOperators {

	public static void main(String[] args) {

//		3) Logical Operators [AND(&&),OR(||),NOT(!)]

		System.out.println(true && true && true && true && true && true);// true
		System.out.println(false && true && true && true && true && true);// false
		System.out.println(false && false && true && true && true && true);// false
		System.out.println(false && false && false && true && true && true);// false
		System.out.println(false && false && false && false && false && false);// false

		System.out.println("----------------------------------------------------");
		System.out.println(true || false || false || false || false || false);// true
		System.out.println(false || false || false || false || false || false);// false
		System.out.println("----------------------------------------------------");
		System.out.println(!true);// false
		System.out.println(!false);// true

	}

}
