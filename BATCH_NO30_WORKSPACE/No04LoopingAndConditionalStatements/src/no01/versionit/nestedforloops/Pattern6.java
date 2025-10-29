package no01.versionit.nestedforloops;

public class Pattern6 {

	public static void main(String[] args) {

		for (char i = 'a'; i <= 'e'; i++) {

			for (char j = 'e'; j >= 'a'; j--) {

				System.out.print(j);

			}

			System.out.println();

		}

	}

}
