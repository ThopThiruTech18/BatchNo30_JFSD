package in03.versionit.inheritence3;

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
	public	void printData()
	{
		System.out.println(this.name);
		System.out.println(this.id);
	}

}
