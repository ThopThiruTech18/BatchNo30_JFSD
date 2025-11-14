package in.thiru.basic;

import java.util.Scanner;

public class Program02 {

	public static void main(String[] args) {

//		2. Write a program to find the length of a string.

//		Scanner sc=new Scanner(System.in);
//		
//		System.out.println("Enter any name");
//		String nextLine = sc.nextLine();
//		
//		System.out.println("The length of the given name is : "+nextLine.length());

		// method-1[By using lenth method]
//		int length = "Kiran".length();
//		System.out.println("The length of the string is : "+length);

		String name = "chandu";
		int count = 0;

		int start = 0;
		int end = name.length() - 1;

		while (start <= end) {

			count++;

			start++;
		}
		System.out.println("The length of the string is " + count);

	}

}
