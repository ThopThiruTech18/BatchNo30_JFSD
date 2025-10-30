package in.thiru;

public class Example08 {

	public static void main(String[] args) {

//		6. Case Conversion
//		-------------------
//		- toUpperCase(): "hello".toUpperCase() → "HELLO"
//		- toLowerCase(): "HELLO".toLowerCase() → "hello"

		String name = "vijay";
		System.out.println(name.toUpperCase());

		String name1 = "HELLO";
		System.out.println(name1.toLowerCase());

//		7. Trimming and Replacing
//		---------------------------
//		- trim(): " hello ".trim() → "hello"
//		- replace(char, char): "hello".replace('l', '99') → "hexxo"

		System.out.println("      hi how are you         ");
		System.out.println("      hi how are you         ".trim());

		System.out.println("hello how are you".replace(' ', ','));

	}

}
