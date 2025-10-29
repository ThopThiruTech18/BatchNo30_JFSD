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
		
		String name="banana";
		System.out.println(name.indexOf("n"));  //2
		System.out.println(name.lastIndexOf("n"));//4
		
		
		System.out.println(name.contains("nana"));
		System.out.println(name.contains("na"));
		System.out.println(name.contains("ba"));
		System.out.println(name.contains("an"));
		System.out.println(name.contains("xxzz"));
		System.out.println("-----------------------");
		System.out.println(name.startsWith("ba"));
		System.out.println(name.startsWith("bana"));
		System.out.println(name.startsWith("an"));
		
		System.out.println("-----------------------");
		
		System.out.println(name.endsWith("nana"));
		System.out.println(name.endsWith("a"));
		System.out.println(name.endsWith("nan"));

		
		
		



	}

}
