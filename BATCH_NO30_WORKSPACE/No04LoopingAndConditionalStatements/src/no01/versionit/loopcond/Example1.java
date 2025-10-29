package no01.versionit.loopcond;

public class Example1 {
	
	
	public static void main(String[] args) {
		
		System.out.println("Started");
		for (int i = 1; i <= 10; i++) {
//			    1==0
			if(i%2==0)  //2,4,6,8..10
			{
				System.out.println(i);
			}
			
		}
	}

}
