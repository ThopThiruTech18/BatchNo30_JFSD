package no01.versionit.patterns1;

public class Pattern2 {

	public static void main(String[] args) {

//		1) Bottom Left

		for (int i = 1; i <= 5; i++) {
			
			
			for (int spaces = 0; spaces < 5-i; spaces++) {
				System.out.print(" ");
				
			}

			for (int j = 1; j <= i; j++) {

				System.out.print(i);

			}
			System.out.println();

		}

	}

}
