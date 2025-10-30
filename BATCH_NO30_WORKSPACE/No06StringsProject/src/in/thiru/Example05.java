package in.thiru;

public class Example05 {

	public static void main(String[] args) {

//		1. Length and Check Methods
//		----------------------------
//		- length(): "hello".length() → 5
//		- isEmpty(): "".isEmpty() → true
//		- isBlank(): "  ".isBlank() → true (Java 11+)

		String name = "VersionIt";
		String name1 = "   ";
		System.out.println(name.length());
		System.out.println(name1.length());

		System.out.println(name1.isEmpty());
		System.out.println(name1.isBlank());

		System.out.println(name.charAt(0));
		System.out.println(name.charAt(name.length() - 1));

		String str1 = "abc";
		String str2 = "Abc";

		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));

	}

}
