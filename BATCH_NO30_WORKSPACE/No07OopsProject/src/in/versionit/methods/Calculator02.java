package in.versionit.methods;

public class Calculator02 {

	public int add(int a, int b) {

		int c = a + b;

		return c;

	}

	public static void main(String[] args) {

		Calculator02 cal = new Calculator02();
		int add = cal.add(20, 80);
		System.out.println(add);

	}
}
