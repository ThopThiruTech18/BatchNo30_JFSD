package in.thiru;

public class Example14 {

	public static void main(String[] args) {

//		12. Strip Methods (Java 11+)
//		-----------------------------
//		- stripLeading(): "  hello ".stripLeading() → "hello "
//		- stripTrailing(): " hello  ".stripTrailing() → " hello"
		
		
		String name="            hello                ";
		System.out.println(name.stripLeading());
		System.out.println(name.stripTrailing());

	}

}
