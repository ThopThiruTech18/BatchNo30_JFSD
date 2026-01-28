package in.versionit.foreachmethod;

import java.util.ArrayList;

public class Example {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		list.forEach(s->System.out.println(s));
		
	}

}
