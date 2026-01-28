package in03.versionit.inheritence3;

public class Employee extends CollegeMember{
	
	double salary;
	
//	String name;
//	int id;
	
	Employee(String name,int id,double salary)
	{
		super(name, id);
		this.salary=salary;
		
	}
	
	public void printData()
	{
		System.out.println(super.name);
		System.out.println(super.id);
		System.out.println(this.salary);
	}

	

}
