package in.thiru.intermediatelevel;

import java.util.Arrays;

public class Example11 {

	public static void main(String[] args) {

		
		String name1="Silent".toUpperCase();	//eilnst
		String name2="LisTen".toUpperCase();	//eilnst
		
		char[] x = name1.toCharArray();
		char[] y = name2.toCharArray();
		
		
		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(y));
		
		Arrays.sort(x);
		Arrays.sort(y);
		
		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(y));
		
		if(Arrays.equals(x, y))
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Non-Anagram");
		}
		
		

	}

}
