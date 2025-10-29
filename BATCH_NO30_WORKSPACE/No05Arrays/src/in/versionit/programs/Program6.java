package in.versionit.programs;

public class Program6 {

	public static void main(String[] args) {

		int[] array = { 10, 20, 50, 8, 5, 6, 1 };

		System.out.println("Even numbers");
		for (int i : array) {

			if (i % 2 == 0) {
				System.out.println(i);
			}

		}
		
		System.out.println("Odd Numbers");
		for (int i : array) {

			if (i % 2 == 1) {
				System.out.println(i);
			}

		}

	}

}
