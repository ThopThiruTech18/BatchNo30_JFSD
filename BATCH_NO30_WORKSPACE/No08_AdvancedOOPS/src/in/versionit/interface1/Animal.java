package in.versionit.interface1;

public interface Animal  {
	
	
//	Animal()
//	{
//		
//	}
//	
	
	double PI=3.14;  //public static final
	
	
	//methods should be abstract or static or default
	//===============================================
	
	public void m1();  //abstract method
	public void m2();  //abstract method
	public void m3(); //abstract method
	public default void drink()
	{
		System.out.println("Animal :: drink");
	}
	public static void jump()
	{
		System.out.println("Animal :: jump");
	}
	

}
