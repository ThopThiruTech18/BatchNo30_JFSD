package no01.versionit.patterns1;

import java.lang.reflect.Array;

public class Pattern6 {

	public static void main(String[] args) {
//
//		from 1 to 5
//		j <= 2 * i - 1  &  spaces <= 5 - i
//
//
//		    1
//		   222
//		  33333
//		 4444444
//		555555555
		
		
//		555555555
//		 4444444
//		  33333
//		   222
//		    1

		

		topToBottomPyramid();
		bottomToTopPyramid();

	}

	private static void topToBottomPyramid() {
		for (int i = 5; i >= 1; i--) {

			for (int spaces = 1; spaces <= 5 - i; spaces++) {

				System.out.print(" ");

			}

			for (int j = 1; j <= 2 * i - 1; j++) {

				System.out.print(i);

			}

			System.out.println();

		}
	}

	private static void bottomToTopPyramid() {
		for (int i = 1; i <= 5; i++) {

			for (int spaces = 1; spaces <= 5 - i; spaces++) {

				System.out.print(" ");

			}

			for (int j = 1; j <= 2 * i - 1; j++) {

				System.out.print(i);

			}

			System.out.println();

		}
	}

}
