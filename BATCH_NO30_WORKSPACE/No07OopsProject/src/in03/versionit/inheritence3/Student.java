package in03.versionit.inheritence3;

public class Student extends CollegeMember{

	
	int marks;
	Student(String name, int id,int marks) {
		super(name, id);
		this.marks=marks;
		// TODO Auto-generated constructor stub
	}

	public void printData()
	{
		System.out.println(super.name);
		System.out.println(super.id);
		System.out.println(this.marks);
	}
	
	
	
	
	
	
	
	
	
	

}
