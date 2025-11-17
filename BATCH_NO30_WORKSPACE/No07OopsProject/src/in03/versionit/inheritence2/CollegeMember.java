package in03.versionit.inheritence2;

public class CollegeMember {
	
	String name;
	int id;
	
	CollegeMember(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	
	void printData()
	{
		System.out.println(this.name);
		System.out.println(this.id);
	}

}
