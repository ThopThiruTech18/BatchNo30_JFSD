package in02.thiru.fi.optional;

import java.util.Optional;

public class Example02 {

	static String name="hari";

	public static void main(String[] args) {

//	   if(name != null)
//	   {
//			name.length();
//	   }
		
		
		Optional<String> optionalName = Optional.ofNullable(name);
		if(optionalName.isPresent())
		{
			String name = optionalName.get();
			System.out.println(name);
		}
		
	   
	   
	   

	}
}
