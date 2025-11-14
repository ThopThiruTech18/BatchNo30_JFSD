package in.versionit.programs;

public class Program9 {

	public static void main(String[] args) {

//		int[][] arr = new int[3][];   // 3 rows
//
//		arr[0] = new int[2];  // row 1 → 2 elements
//		arr[1] = new int[3];  // row 2 → 3 elements
//		arr[2] = new int[1];  // row 3 → 1 element

//		int[] arr = { 1, 2, 2, 3, 4, 3, 3 };
//		boolean[] visited = new boolean[arr.length];
//		for (int i = 0; i < arr.length; i++) {
//			if (visited[i])
//				continue;
//			int count = 1;
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] == arr[j]) {
//					visited[j] = true;
//					count++;
//				}
//			}
//			System.out.println(arr[i] + " occurs " + count + " times");
//		}

		int[] arr = { 1, 2, 2, 3, 4, 3, 3 };

		boolean[] isVisited = new boolean[arr.length];

		for (int i = 0; i < arr.length; i++) {

			if (isVisited[i])
				continue;

			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					isVisited[j] = true;
					count++;

				}

			}

			System.out.println(arr[i] + " occurs " + count + " times");

		}

	}

}
