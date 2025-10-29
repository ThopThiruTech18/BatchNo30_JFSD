package no01.versionit.nestedforloops;

public class Pattern10 {

	public static void main(String[] args) {

		for (char i = 'a'; i <= 'z'; i++) {

			for (char j = 'a'; j <= i; j++) {

				System.out.print(i);

			}

			System.out.println();

		}

	}

}
