package in.versionit.polymorphism.methodoverloading;

public class Calculator3 {

	int add(int a, int b) {
		return a + b;
	}

	double add(double a, double b) {
		return a + b;
	}

	public static void main(String[] args) {

		Calculator3 cal1 = new Calculator3();

		int add = cal1.add(10, 20);
		double add2 = cal1.add(30.0, 20.0);

		System.out.println(add);
		System.out.println(add2);

	}

}
