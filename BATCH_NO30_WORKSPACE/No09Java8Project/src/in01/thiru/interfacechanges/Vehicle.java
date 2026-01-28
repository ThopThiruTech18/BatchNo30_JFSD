package in01.thiru.interfacechanges;

public interface Vehicle {
	
	
	public void startVehicle();
	default void electricalEngine()
	{
		System.out.println("Vehicle :: Started..");
	}
	static void airEngine()
	{
		System.out.println("Vehicle :: Started..");
	}

	
}


