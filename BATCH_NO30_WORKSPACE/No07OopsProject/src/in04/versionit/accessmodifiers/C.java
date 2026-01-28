package in04.versionit.accessmodifiers;

public class C {
	
	public static void main(String[] args) {
		
		
		A a1=new A();
//		System.out.println(a1.a);//private
		System.out.println(a1.b);//default
		System.out.println(a1.c);//protected
		System.out.println(a1.d);//public
		
	}
	
	
}
