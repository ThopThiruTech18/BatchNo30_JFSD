package in.versionit.programs;

public class Program2 {
	
	public static void main(String[] args) {
		
//		1)WAJP Calculate the Sum of the array.
		
		int[] a= {1,2,3,4};
		int sum=0;
		
		for (int i : a) {
			
			sum=sum+i;  //sum=1+2=3+3=6+4=10 sum
			
		}
		System.out.println(sum);
		System.out.println(sum/a.length);  // sum of the array/no of values in the array
		
	}

}
