package in.versionit.programs;

public class Program5 {

	public static void main(String[] args) {

//		int a = 10; // --> a=20
//		int b = 20; // --> b=10
//
//		int temp;
//
//		System.out.println("Before swapping");
//		System.out.println(a);
//		System.out.println(b);
//
//		temp = a;
//		a = b;
//		b = temp;
//		
//		System.out.println("After swapping");
//		System.out.println(a);
//		System.out.println(b);

		// 10
		int[] array = { 10, 20, 50, 8, 5, 6, 1 }; // 10, 20, 50, 8, 5, 6, 1
//						0	1    2   3 4   5  6		  	//20, 10, 50, 8, 5, 6, 1
		// 50, 10, 20, 8, 5, 6, 1
		// 10, 50, 20, 8, 5, 6, 1
		// 10, 20, 50, 8, 5, 6, 1

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array.length; j++) {

				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}

			}

		}

		for (int i = 0; i < array.length; i++) {

			System.out.println(array[i]);

		}

	}

}
