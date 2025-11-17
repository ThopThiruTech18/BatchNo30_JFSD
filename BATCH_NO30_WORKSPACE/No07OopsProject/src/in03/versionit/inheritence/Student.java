package in03.versionit.inheritence;

public class Student extends CollegeMember{

	
	int marks;
	Student(String name, int id,int marks) {
		super(name, id);
		this.marks=marks;
		// TODO Auto-generated constructor stub
	}

	void printData()
	{
		System.out.println(this.name);
		System.out.println(this.id);
		System.out.println(this.marks);
	}
	
	
	
	
	
	
	
	
	
	

}
