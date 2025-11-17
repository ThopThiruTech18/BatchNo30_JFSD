package in03.versionit.inheritence;

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
		System.out.println(this.name);
		System.out.println(this.id);
		System.out.println(this.salary);
	}

	

}
