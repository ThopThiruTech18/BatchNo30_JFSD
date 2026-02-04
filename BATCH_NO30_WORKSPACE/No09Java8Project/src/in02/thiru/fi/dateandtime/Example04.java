package in02.thiru.fi.dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Example04 {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		
		
		System.out.println(date.plusDays(5));
		System.out.println(date.plusMonths(2));
		System.out.println(date.plusYears(2));
		System.out.println(date.plusWeeks(1));
		System.out.println("--------------");
		System.out.println(date.minusDays(5));
		System.out.println(date.minusMonths(2));
		System.out.println(date.minusYears(2));
		System.out.println(date.minusWeeks(1));
		
		
		LocalTime time = LocalTime.now();
		
		System.out.println(time.plusHours(3));
		System.out.println(time.plusMinutes(3));
		System.out.println(time.plusSeconds(10));
		System.out.println(time.plusNanos(10));
		
		System.out.println(time.minusHours(3));
		System.out.println(time.minusMinutes(3));
		System.out.println(time.minusSeconds(10));
		System.out.println(time.minusNanos(10));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
