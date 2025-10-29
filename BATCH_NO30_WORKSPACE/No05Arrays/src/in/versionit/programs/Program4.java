package in.versionit.programs;

import java.util.Arrays;

public class Program4 {

	public static void main(String[] args) {

//		4)WAJP Find the min value in the array
//	4)WAJP Find the max value in the array

		int[] array = { 100, 20, 50, 80, 90 };
		int min = array[0];
		int max = array[0];
		for (int i = 0; i < array.length; i++) {

			if (min > array[i]) { //20
				min = array[i];
			}

			if (max < array[i]) { //100
				max = array[i];
			}

		}

		System.out.println(min);
		System.out.println(max);

	}

}
