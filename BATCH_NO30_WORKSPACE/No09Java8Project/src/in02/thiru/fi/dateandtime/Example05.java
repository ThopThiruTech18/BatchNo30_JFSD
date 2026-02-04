package in02.thiru.fi.dateandtime;

import java.time.LocalDate;

public class Example05 {

	public static void main(String[] args) {

		boolean leapYear = LocalDate.parse("2800-12-22").isLeapYear();
		if (leapYear) {
			System.out.println("Leap year");
		} else {
			System.out.println("Not a Leap year");
		}

	}

}
