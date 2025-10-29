package in.nextit;

public class NonPrimitiveDataTypes {
	
	
	public static void main(String[] args) {
		
		int i1 = 500; //4==> 100 variables==> 400 bytes
		int i2 = 500; //4==> 100 variables==> 400 bytes
		int i3 = 500; //4==> 100 variables==> 400 bytes
		int i4 = 500; //4==> 100 variables==> 400 bytes
		int i5 = 500; //4==> 100 variables==> 400 bytes
		
		
		
		int[] numbers=new int[] {10,23,50,89,48,13};  //int[] 100values-->4bytes
		                 //400-4=394
		
		char[] character=new char[] {'a','v','c'};  //int[] 100values-->4bytes
		
		float[] prices=new float[] {10.10f,20.20f,30.30f};  //int[] 100values-->4bytes
		
		
		String s="hari";
		String str=new String("vijay");
		
	}

}
