package in.thiru.intermediatelevel;

import java.util.Arrays;

public class Example12 {

	public static void main(String[] args) {

		reverseEachWordInTheSentence();
		reverseEachWordInTheSentence();
		reverseEachWordInTheSentence();
		reverseEachWordInTheSentence();
		reverseEachWordInTheSentence();
		reverseEachWordInTheSentence();
		reverseEachWordInTheSentence();
		reverseEachWordInTheSentence();
		reverseEachWordInTheSentence();
		reverseEachWordInTheSentence();

	}

	private static void reverseEachWordInTheSentence() {
		String str = "hello how are you"; // SUM--> olleh woh era uoy

		String[] words = str.split(" ");

		String totalSum = ""; 

		for (String word : words) {

			String sum = "";

			for (int i = word.length() - 1; i >= 0; i--) {

				sum = sum + word.charAt(i);

			}

			totalSum = totalSum + sum + " ";

		}

		System.out.println(totalSum);
	}

}
