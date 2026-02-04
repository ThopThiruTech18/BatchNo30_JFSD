package in02.thiru.fi.dateandtime;

import java.time.LocalDate;

public class Example06 {

	public static void main(String[] args) {

		boolean before = LocalDate.parse("2023-12-22").isBefore(LocalDate.parse("2022-12-22"));
		System.out.println("Before Date : " + before);

	}

}
