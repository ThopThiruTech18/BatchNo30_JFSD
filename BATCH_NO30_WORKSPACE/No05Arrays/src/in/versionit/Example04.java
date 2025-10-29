package in.versionit;

public class Example04 {

	public static void main(String[] args) {

		int[] array1 = new int[5];
		array1[0] = 10;
		array1[1] = 20;
		array1[2] = 30;
		array1[3] = 40;
		array1[4] = 50;

		System.out.println("---------------- for loop--------------------");
		for (int i = 0; i <= array1.length - 1; i++) {
			System.out.println(array1[i]);

		}
		System.out.println("---------------- for-each loop--------------------");

		for (int i : array1) {

			System.out.println(i);

		}

		System.out.println("---------------- while loop--------------------");
		int start = 0;
		int end = array1.length - 1;
		while (start <= end) {

			System.out.println(array1[start]);
			start++;
		}

	}

}
