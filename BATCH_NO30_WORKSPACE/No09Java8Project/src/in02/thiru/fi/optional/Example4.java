package in02.thiru.fi.optional;

import java.util.Optional;

public class Example4 {

	public static void main(String[] args) {
		
		Example4 example=new Example4();
		
		Optional<String> optionalName = example.getNameById(100);
		
		if(optionalName.isPresent())
		{
			String name = optionalName.get();
			System.out.println(name);
			
			
		}
		
	}

	public Optional<String> getNameById(Integer id) {
		
		String name=null;
		
		if(id == 100)
		{
			name= "hari";
		}
		else if(id == 101)
		{
			name= "charan";
		}
		else if(id == 102)
		{
			name= "mani";
		}

		return Optional.ofNullable(name);
	}
}
