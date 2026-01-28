package in.versionit.streamapi1;

import java.util.Arrays;
import java.util.OptionalInt;

public class Example02 {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6 };
		
	int max = Arrays.stream(a).max().getAsInt();
	int min = Arrays.stream(a).min().getAsInt();
    int sum = Arrays.stream(a).sum();
    long count = Arrays.stream(a).count();
    double average = Arrays.stream(a).average().getAsDouble();
    System.out.println(max);
    System.out.println(min);
    System.out.println(sum);
    System.out.println(count);
    System.out.println(average);
    
    
	
		
		
		
		

	}

}
