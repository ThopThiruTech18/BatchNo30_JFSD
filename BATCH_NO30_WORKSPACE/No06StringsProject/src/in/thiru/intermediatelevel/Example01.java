package in.thiru.intermediatelevel;

public class Example01 {

	public static void main(String[] args) {

		String name = "hello";
//					   01234

//		for (int i = name.length() - 1; i >= 0; i--) {
//
//			System.out.print(name.charAt(i));
//		}
		
		String reverseString1=new StringBuilder(name).reverse().toString();
		System.out.println(reverseString1);
		
		String reverseString2=new StringBuffer(name).reverse().toString();
		System.out.println(reverseString2);

	}

}
