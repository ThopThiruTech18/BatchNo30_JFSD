package in.thiru.intermediatelevel;

public class Example02 {

	public static void main(String[] args) {

		String name = "hello";
//					   01234
		
		char[] ch=name.toCharArray();

		for (int i = name.length() - 1; i >= 0; i--) {

			System.out.println(ch[i]);
		}

	}

}
