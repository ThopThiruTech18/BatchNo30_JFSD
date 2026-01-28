package in02.thiru.fi.stringjoiner;

import java.util.StringJoiner;

public class Example01 {
	
	static Integer number1=10;
	static Integer number2;
	static Integer number3;
	
	
	static int a1=10;
	static int a2;
	static double a3;
	

	public static void main(String[] args) {
		
		
		StringJoiner joiner=new StringJoiner("@");
		joiner.add("hari1");
		joiner.add("hari2");
		joiner.add("hari3");
		joiner.add("hari4");
		
		System.out.println(joiner);
		
		
		StringJoiner joiner1=new StringJoiner("-", "(", ")");
		joiner1.add("hari1").add("hari2").add("chinna");
		
		
		System.out.println(joiner1);
		
		
		
		
		System.out.println(number1.doubleValue());
		
		System.out.println(number2);
		System.out.println(number3);
		
		
		System.out.println(a1);
		
		System.out.println(a2);
		System.out.println(a3);
		
	}

}
