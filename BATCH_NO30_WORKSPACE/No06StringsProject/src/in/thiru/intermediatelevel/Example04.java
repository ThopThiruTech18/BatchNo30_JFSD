package in.thiru.intermediatelevel;

public class Example04 {

	public static void main(String[] args) {

		String name = "RacEcar";
//					 0123456

		String sum = "";

		for (int i = name.length() - 1; i >= 0; i--) {

			sum = sum + name.charAt(i);
		}
		
		System.out.println(name);
		System.out.println(sum);
		
		if(name.equalsIgnoreCase(sum))
		{
			System.out.println("Polindrom");
		}
		else
		{
			System.out.println("Not a poilindrome");
		}

	}

}
