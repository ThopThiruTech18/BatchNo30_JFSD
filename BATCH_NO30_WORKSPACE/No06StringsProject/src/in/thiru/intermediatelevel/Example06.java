package in.thiru.intermediatelevel;

public class Example06 {

	public static void main(String[] args) {

		String name = "appleayu";
		char[] x = name.toCharArray();

		for (int i = 0; i < name.length(); i++) {

			boolean isUnique = true;

			for (int j = 0; j < name.length(); j++) {

				if (i != j && x[i] == x[j]) {
					isUnique = false;
				}

			}

			if (isUnique==true) {
				System.out.println(x[i]);
				break;
			}

		}

	}

}
