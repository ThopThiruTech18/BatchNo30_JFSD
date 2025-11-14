package in.thiru.intermediatelevel;

public class Example07 {

	public static void main(String[] args) {

		String name = "applea";
		char[] x = name.toCharArray();

		for (int i = 0; i < name.length(); i++) {

			boolean isUnique = true;

			for (int j = 0; j < name.length(); j++) {

				if (i != j && x[i] == x[j]) {
					isUnique = false;
				}

			}

			if (isUnique == false) {
				System.out.println(x[i]);
			}

		}

	}

}
