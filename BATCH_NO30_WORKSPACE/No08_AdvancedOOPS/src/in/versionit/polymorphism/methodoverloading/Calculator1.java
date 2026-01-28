package in.versionit.polymorphism.methodoverloading;

public class Calculator1 {

	void add(int a, double b) {
		System.out.println(a + b);
	}

	void add(double a,  int b) {
		System.out.println(a + b );
	}

	
	public static void main(String[] args) {

		Calculator1 cal1 = new Calculator1();

		cal1.add(10, 20.0);
		cal1.add(30.0, 10);


	}

}
