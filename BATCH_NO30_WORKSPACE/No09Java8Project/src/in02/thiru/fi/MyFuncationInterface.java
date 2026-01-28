package in02.thiru.fi;

@FunctionalInterface
public interface MyFuncationInterface {
	public void m1();
	

	default void m2() {
		System.out.println("MyFuncationInterface :: default :: m2");
	}
	
	//()->System.out.println("MyFuncationInterface :: default :: m2");

	default void m3() {
		System.out.println("MyFuncationInterface :: default :: m3");
	}

	default void m4() {
		System.out.println("MyFuncationInterface :: default :: m4");
	}

	static void m5() {
		System.out.println("MyFuncationInterface :: default :: m2");
	}

	static void m6() {
		System.out.println("MyFuncationInterface :: default :: m3");
	}

	static void m7() {
		System.out.println("MyFuncationInterface :: default :: m4");
	}

}
