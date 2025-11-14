package in02.versionit.constructor;

public class Employee {

	String name;
	int age;
	double salary;
	
	//default constructor

	//zero-param constructor
	Employee()
	{
		
	}

	//param constructor
	Employee(String l_name, int l_age, double l_salary) {

		name = l_name;
		age = l_age;
		salary = l_salary;

	}

	void printData() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(salary);
	}

}
