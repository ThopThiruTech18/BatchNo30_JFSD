package no01.versionit.nestedforloops;

public class Pattern11 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {

			for (int spaces = 0; spaces < 5 - i; spaces++) {

				System.out.print(" ");

			}

			for (int j = 1; j <= i; j++) {

				System.out.print(i);

			}

			System.out.println();

		}

	}

}
