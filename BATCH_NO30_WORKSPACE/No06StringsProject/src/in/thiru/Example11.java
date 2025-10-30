package in.thiru;

public class Example11 {

	public static void main(String[] args) {

//		9. Conversion
//		--------------
//		- toCharArray(): "abc".toCharArray() → ['a', 'b', 'c']      String --> char[]
//		- valueOf(any): String.valueOf(123) → "123"                 int  --> String

		int number = 1234;
		String stngOutput = String.valueOf(number);

		System.out.println(stngOutput);

	}

}
