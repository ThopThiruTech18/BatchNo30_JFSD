package in02.thiru.fi.supplier;

import java.util.Random;
import java.util.function.Supplier;

public class Example {

	public static void main(String[] args) {

		Supplier<String> s = () -> "Welcome to versionIt";

		System.out.println(s.get());

		Supplier<Integer> s1 = () -> 1000;
		System.out.println(s1.get());
		
		
		Supplier<Long> time=()->System.currentTimeMillis();
		System.out.println(time.get());

		
		Random r=new Random();
		
		Supplier<Integer> rand=()->r.nextInt(100);  //1 to 100
		
		System.out.println(rand.get());
	}

}
