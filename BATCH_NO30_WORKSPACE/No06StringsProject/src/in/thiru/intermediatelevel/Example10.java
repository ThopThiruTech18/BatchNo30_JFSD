package in.thiru.intermediatelevel;

public class Example10 {

	public static void main(String[] args) {

		String name = "hellol"; // h-1,e-1,l-2,o-1
//					   01234

		char[] x = name.toCharArray();

		boolean[] isVisited = new boolean[name.length()];

		for (int i = 0; i < name.length(); i++) {

			if (isVisited[i])
				continue;
			int count = 1;

			for (int j = i + 1; j < name.length(); j++) {

				if (x[i] == x[j]) {
					count++;
					isVisited[j] = true;
				}

			}

			System.out.println(x[i] + ":" + count);

		}

	}

}
