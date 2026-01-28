package in.versionit.abstract2;

public abstract class Animal {
	
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	
	 int speed = 120;         // instance variable
	 static String brand = "BMW";  // static variable

	public abstract void sound();
	public abstract void sound1();
	public abstract void sound2();

	public void eat1() {
		System.out.println("Animal :: eating1....");
	}
	public void eat2() {
		System.out.println("Animal :: eating2....");
	}


}
