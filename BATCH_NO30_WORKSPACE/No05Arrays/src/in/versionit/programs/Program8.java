package in.versionit.programs;

public class Program8 {

	public static void main(String[] args) {

		int[] array = { 10, 20, 30, 30, 40, 10 };

		for (int i = 0; i < array.length; i++) {

			boolean isUnique = true;

			for (int j = 0; j < array.length; j++) {

				if (i != j && array[i] == array[j]) {
					isUnique = false;
				}

			}
			
			
			if(isUnique==false)
			{
				System.out.println(array[i]);
			}

		}

	}

}
