package in03.versionit.inheritence2;

public class Employee extends CollegeMember{
	
	double salary;
	
//	String name;
//	int id;
	
	Employee(String name,int id,double salary)
	{
		super(name, id);
		this.salary=salary;
		
	}
	
	void printData()
	{
		super.printData();
		System.out.println(this.salary);
	}

	

}
