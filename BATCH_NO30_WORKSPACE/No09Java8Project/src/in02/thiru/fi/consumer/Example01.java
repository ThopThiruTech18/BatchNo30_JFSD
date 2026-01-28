package in02.thiru.fi.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Example01 {
	
	public static void main(String[] args) {
		
		
		Consumer<String> consumer= (name) -> System.out.println("Welcome to India : "+name);
		
		consumer.accept("Hari");
		consumer.accept("Vijay");
		consumer.accept("Chinna");
		
		
		List<Integer> asList = Arrays.asList(10,20,30,40);
		
		asList.forEach(i->System.out.println(i));
		
		
		
	}

	
}
