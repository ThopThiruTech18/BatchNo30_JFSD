package in01.thiru.interfacechanges;

public class Bus implements Vehicle{

	@Override
	public void startVehicle() {
		System.out.println("Bus :: started");
		
	}

	
	@Override
	public void electricalEngine() {
		// TODO Auto-generated method stub
		Vehicle.super.electricalEngine();
	}


}
