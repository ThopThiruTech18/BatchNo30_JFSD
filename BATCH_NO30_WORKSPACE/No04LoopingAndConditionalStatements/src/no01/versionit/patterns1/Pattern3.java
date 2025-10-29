package no01.versionit.patterns1;

public class Pattern3 {

	public static void main(String[] args) {

//		3) Top Left 

//		1 2 3 4 5 
//		2 3 4 5 
//		3 4 5 
//		4 5 
//		5 
		
		for (int i = 5; i >= 1; i--) {
			
			for (int j = i; j >= 1; j--) {
				
				System.out.print(j);
				
			}
			
			System.out.println();
			
		}

		

	}

}
