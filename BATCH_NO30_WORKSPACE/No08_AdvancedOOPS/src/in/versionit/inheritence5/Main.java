package in.versionit.inheritence5;

public class Main {
	
	public static void main(String[] args) {
		
		
//		Child child1=new Child();
//		
//		child1.childMethod();
//		child1.parent1Method();
//		child1.parent2Method();
//		child1.parent3Method();
		
		
		Parent1 p1=new Child();
		p1.parent1Method();
		
		Parent2 p2=new Child();
		p2.parent2Method();
		
		
		Parent3 p3=new Child();
		p3.parent3Method();
		
		
	}

}
