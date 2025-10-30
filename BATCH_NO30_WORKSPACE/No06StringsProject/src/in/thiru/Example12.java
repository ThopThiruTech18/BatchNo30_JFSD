package in.thiru;

public class Example12 {

	public static void main(String[] args) {

//		10. Formatting
//		---------------
//		- format(String, ...): String.format("Hi %s", "Thiru") → "Hi Thiru"
		
		
		 String format = String.format("Hi %s", "Thiru");
		 System.out.println(format);
		 String format2 = String.format("Hi %d", 534654);
		 System.out.println(format2);
		 String format3 = String.format("Hi %c", 'z');
		 System.out.println(format3);
		

	}

}
