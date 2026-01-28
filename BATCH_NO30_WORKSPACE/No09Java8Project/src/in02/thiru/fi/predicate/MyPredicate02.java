package in02.thiru.fi.predicate;

import java.util.function.Predicate;

public class MyPredicate02 {

	public static void main(String[] args) {

		String[] names = { "Anushka", "Anupama", "Deepika", "Kajol", "Sunny" };

		Predicate<String> pred = name -> name.charAt(0) == 'A';  // 'S'=='A'

		for (String name : names) {

			if (pred.test(name)) {
				System.out.println(name);
			}

		}

	}

}
