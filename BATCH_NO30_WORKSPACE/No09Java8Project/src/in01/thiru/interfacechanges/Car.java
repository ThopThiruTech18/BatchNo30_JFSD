package in01.thiru.interfacechanges;

public class Car implements Vehicle {

	@Override
	public void startVehicle() {
		System.out.println("Car :: started");
		
	}
	
	@Override
	public void electricalEngine() {
		// TODO Auto-generated method stub
		Vehicle.super.electricalEngine();
	}

}
