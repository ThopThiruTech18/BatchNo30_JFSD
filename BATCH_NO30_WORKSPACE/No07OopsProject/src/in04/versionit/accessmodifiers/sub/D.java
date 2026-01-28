package in04.versionit.accessmodifiers.sub;

import in04.versionit.accessmodifiers.A;

public class D extends A{
	
public static void main(String[] args) {
		
		
		D a1=new D();
		System.out.println(a1.a);//private
		System.out.println(a1.b);//default
		System.out.println(a1.c);//protected
		System.out.println(a1.d);//public
		
	}

}






//in.tcs --> basepackage
//in.tcs.project1  -->subpackage
