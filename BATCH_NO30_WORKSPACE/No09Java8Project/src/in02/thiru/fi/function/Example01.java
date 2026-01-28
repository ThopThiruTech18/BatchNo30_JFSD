package in02.thiru.fi.function;

import java.util.function.Function;

public class Example01 {

	public static void main(String[] args) {

		Function<String, Integer> fun = f -> f.length();

		System.out.println(fun.apply("chinna"));

		Function<String, String> fun1 = name -> "Welcome to India : " + name;

		System.out.println(fun1.apply("Chinna"));

	}

}
