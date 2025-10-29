package no01.versionit.loopcond;

public class Example3 {

	public static void main(String[] args) {

		for (int i = 1; i <= 20; i++) {

			if (i % 6 == 0) {
				System.out.println(i);
			}

		}

		System.out.println("------------------------------");
		
		for (int i = 1; i <= 20; i++) {

			if (i % 10 == 0) {
				System.out.println(i);
			}

		}
	}

}
