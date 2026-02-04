package in02.thiru.fi.dateandtime;

import java.time.LocalDate;
import java.time.Period;

public class Example07 {

	public static void main(String[] args) {

		Period between = Period.between(LocalDate.parse("2000-01-29"), LocalDate.now());

		System.out.println(between);

	}

}
