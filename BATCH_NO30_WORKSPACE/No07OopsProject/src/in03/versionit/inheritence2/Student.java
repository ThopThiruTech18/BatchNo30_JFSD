package in03.versionit.inheritence2;

public class Student extends CollegeMember{

	
	int marks;
	Student(String name, int id,int marks) {
		super(name, id);
		this.marks=marks;
		// TODO Auto-generated constructor stub
	}

	void printData()
	{
		super.printData();
		System.out.println(this.marks);
	}
	
	
	
	
	
	
	
	
	
	

}
