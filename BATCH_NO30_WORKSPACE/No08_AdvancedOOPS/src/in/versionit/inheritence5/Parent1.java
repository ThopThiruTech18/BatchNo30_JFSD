package in.versionit.inheritence5;

public interface Parent1 {
	
	public void parent1Method(); //abstract method
	
	default void m1()
	{
		System.out.println("Parent1 :: m1");
	}
	
	static void m2()
	{
		System.out.println("Parent1 :: m2");
	}

}
