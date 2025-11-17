package in03.versionit.inheritence;

public class CollegeMember {
	
	String name;
	int id;
	public CollegeMember() {
		// TODO Auto-generated constructor stub
	}
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
