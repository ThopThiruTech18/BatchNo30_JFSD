package in.thiru.basic;

public class Program03 {

	public static void main(String[] args) {

        String name1="hello"; 
        String name2="hello"; 
        String name3=new String("hello"); 
        String name4=new String("hello");
        String name5=new String("hello");
        String name6="hello"; 
        String name7="hello1"; 
        
        System.out.println(name1.equals(name2));
        System.out.println(name1.equals(name3));
        System.out.println(name1.equals(name4));
        System.out.println(name1.equals(name5));
        System.out.println(name1.equals(name6));
        System.out.println(name1.equals(name7));
        
        System.out.println(name1==name2);
        System.out.println(name1==name7);
        System.out.println(name1==name7);
        System.out.println(name3==name4);
        
        
        
	}

}
