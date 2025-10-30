package in.thiru;

public class Example09 {

	public static void main(String[] args) {
		
//		8. Splitting and Joining
//		-------------------------
//		- split(String): "a,b,c".split(",") → ["a", "b", "c"]
//
//		- join(CharSequence, ...): String.join("-", "a", "b", "c","d") → "a-b-c-d"
//		
		String name="hi how are you";
		String[] split = name.split(" ");
		
		
		
		String join = String.join("_", "hi","how","are","you");
		System.out.println(join);


	}

}
