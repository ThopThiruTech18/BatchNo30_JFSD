package in02.thiru.fi.predicate;

import java.util.function.Predicate;

public class MyPredicate {

	public static void main(String[] args) {

		Predicate<Integer> pred = s -> s >= 18;

		System.out.println(pred.test(17));
		System.out.println(pred.test(18));
		System.out.println(pred.test(19));

	}

}
