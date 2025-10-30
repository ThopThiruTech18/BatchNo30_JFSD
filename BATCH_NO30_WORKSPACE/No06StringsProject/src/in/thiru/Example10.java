package in.thiru;

public class Example10 {

	public static void main(String[] args) {

//		9. Conversion
//		--------------
//		- toCharArray(): "abc".toCharArray() → ['a', 'b', 'c']      String --> char[]
//		- valueOf(any): String.valueOf(123) → "123"                 int  --> String

		String name = "hello";
//					   01234
		char[] charArray = name.toCharArray();

		System.out.println(charArray[0]);
		System.out.println(charArray[1]);
		System.out.println(charArray[2]);
		System.out.println(charArray[3]);
		System.out.println(charArray[4]);
//	      System.out.println(charArray[5]);

		System.out.println("--------------------------");
		for (int i = 0; i <= charArray.length; i++) {

			System.out.println(charArray[i]);

		}

	}

}
