package in02.versionit.constructor2;

public class Employee {

	String name;
	int age;
	double salary;

	public Employee() {
		
		this("Charan",20,2000.0);
		System.out.println("Employee :: 0-Param Constructor");
	}

	Employee(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;

	}

	void printData() {
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.salary);
	}

}
