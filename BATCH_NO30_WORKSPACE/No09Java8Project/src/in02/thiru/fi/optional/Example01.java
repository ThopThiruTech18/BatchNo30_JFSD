package in02.thiru.fi.optional;

import java.util.Optional;

public class Example01 {
	// 101 --> thiru
	// 102 --> hari
	// 103 --> charan

	// 104

	public static void main(String[] args) {

		String findNameById = Example01.findNameById(104);
		System.out.println(findNameById.toUpperCase());

	}

	static String findNameById(int id) {

		if (id == 101) {
			return "thiru";
		} else if (id == 102) {
			return "hari";
		} else if (id == 103) {
			return "charan";
		} else {
			return null;
		}

	}

}
