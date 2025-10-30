package in.thiru;

public class Example07 {

	public static void main(String[] args) {

//		5. Searching
//		-------------
//		- indexOf(String): "hellllllo".indexOf("l") → 2
//		- lastIndexOf(String): "hello".lastIndexOf("l") → 3
//		- contains(CharSequence): "hello".contains("ll") → true
//		- startsWith(String): "hello".startsWith("he") → true
//		- endsWith(String): "hello".endsWith("lo") → true

		String name = "banana";
		System.out.println(name.indexOf("n")); // 2
		System.out.println(name.lastIndexOf("n"));// 4

		System.out.println(name.contains("nana")); // true
		System.out.println(name.contains("na"));// true
		System.out.println(name.contains("ba"));// true
		System.out.println(name.contains("an"));// true
		System.out.println(name.contains("xxzz"));// false
		System.out.println("-----------------------");
		System.out.println(name.startsWith("ba")); // true
		System.out.println(name.startsWith("bana"));// true
		System.out.println(name.startsWith("an")); // false

		System.out.println("-----------------------");

		System.out.println(name.endsWith("nana")); // true
		System.out.println(name.endsWith("a")); // true
		System.out.println(name.endsWith("nan"));// false

	}

}
