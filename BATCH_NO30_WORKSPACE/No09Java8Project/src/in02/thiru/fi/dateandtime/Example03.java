package in02.thiru.fi.dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Example03 {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		LocalDateTime dateAndTime = LocalDateTime.now();
		System.out.println(dateAndTime);
		
		LocalDate of = LocalDate.of(2021, 1, 20);
		System.out.println(of);
		
		
		
		
		
	}

}
