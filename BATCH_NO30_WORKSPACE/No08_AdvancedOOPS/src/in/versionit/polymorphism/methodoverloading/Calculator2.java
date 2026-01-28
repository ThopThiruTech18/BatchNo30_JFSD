package in.versionit.polymorphism.methodoverloading;

public class Calculator2 {

	void add(int a, int b) {
		System.out.println(a + b);
	}

	void add(double a, double b) {
		System.out.println(a + b );
	}

	
	public static void main(String[] args) {

		Calculator2 cal1 = new Calculator2();

		cal1.add(10, 20);
		cal1.add(30, 10);


	}

}
