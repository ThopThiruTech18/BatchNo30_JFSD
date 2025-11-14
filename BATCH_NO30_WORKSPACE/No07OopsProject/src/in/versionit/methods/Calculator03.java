package in.versionit.methods;

public class Calculator03 {

//	3) with return type without parameters

	public int add() {
		int a = 10;
		int b = 30;

		int c = a + b;
		
		return c;
	}

	public static void main(String[] args) {
		
		
		Calculator03 name=new Calculator03();
		int c = name.add();
		System.out.println(c);
		

	}
}
