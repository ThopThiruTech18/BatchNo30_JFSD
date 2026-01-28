package in.versionit.inheritence4;

public class Child implements Parent1,Parent2,Parent3{

	public void childMethod() {
		System.out.println("Child :: childMethod");
	}

	@Override
	public void parent1Method() {
		System.out.println("Child :: parent1Method ");
		
	}

	@Override
	public void parent2Method() {
		System.out.println("Child :: parent2Method ");
		
	}

	@Override
	public void parent3Method() {
		System.out.println("Child :: parent3Method ");
		
	}

}
