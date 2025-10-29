package in.versionit.conditionalstatements;

public class Example3 {

	public static void main(String[] args) {
		
		//90 to 100  --> A-Grade
		//75 to 89   --> B-Grade
		//50 to 74   --> C-Grade
		//35 to 49   --> D-Grade
		//< 35       --> Fail-Next time luck
		
		
		int marks=20;
		
		if(marks>=90)
		{
			System.out.println(" A-Grade");
		}
		else if(marks>=75)
		{
			System.out.println(" B-Grade");
		}
		else if(marks>=50)
		{
			System.out.println(" C-Grade");
		}
		else if(marks>=35)
		{
			System.out.println(" D-Grade");
		}
		else
		{
			System.out.println("Fail-Next time luck");
		}
		
		
		

	}

}
