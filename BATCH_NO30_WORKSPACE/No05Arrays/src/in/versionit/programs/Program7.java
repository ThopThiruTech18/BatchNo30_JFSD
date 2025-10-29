package in.versionit.programs;

public class Program7 {

	public static void main(String[] args) {

		int[] array = { 10, 20, 50, 8, 5, 6, 1 };

		int evenCount = 0;
		int oddCount = 0;

		for (int i : array) {

			if (i % 2 == 0) {
				evenCount++;
			} else if (i % 2 != 0) {
				oddCount++;
			}

		}
		
		System.out.println("Total Even Nos :"+evenCount);
		System.out.println("Total odd Nos :"+oddCount);

	}

}
