package in.versionit.polymorphism.methodoverloading;

public class Calculator {

	

	void add(int a, int b) {
		System.out.println(a + b);
	}

	void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	void add(int a, int b, int c, int d) {
		System.out.println(a + b + c + d);
	}

	public static void main(String[] args) {

		Calculator cal1 = new Calculator();

		cal1.add(10, 20);
		cal1.add(30, 10, 50);
		cal1.add(30, 10, 50, 20);

	}

}
