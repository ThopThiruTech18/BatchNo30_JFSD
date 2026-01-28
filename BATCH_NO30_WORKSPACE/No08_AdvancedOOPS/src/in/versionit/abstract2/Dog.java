package in.versionit.abstract2;

public class Dog extends Animal{

	@Override
	public void sound() {
		System.out.println("Dog : sound");
		
	}

	@Override
	public void sound1() {
		System.out.println("Dog : sound1");
		
	}

	@Override
	public void sound2() {
		System.out.println("Dog : sound2");
		
	}
	
	@Override
	public void eat1() {
		System.out.println("Dog : eat1");
	}
	
	
	public void printData()
	{
		System.out.println(super.speed+" : "+super.brand);
	}
	
	

}
