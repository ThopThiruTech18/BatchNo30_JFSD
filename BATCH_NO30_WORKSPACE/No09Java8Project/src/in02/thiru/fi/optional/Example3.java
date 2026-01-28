package in02.thiru.fi.optional;

public class Example3 {

	public static void main(String[] args) {
		
		Example3 example=new Example3();
		
		String name = example.getNameById(1000);
		
		System.out.println(name.length());
		
	}

	public String getNameById(Integer id) {
		
		if(id == 100)
		{
			return "hari";
		}
		else if(id == 101)
		{
			return "charan";
		}
		else if(id == 102)
		{
			return "mani";
		}

		return null;
	}
}
