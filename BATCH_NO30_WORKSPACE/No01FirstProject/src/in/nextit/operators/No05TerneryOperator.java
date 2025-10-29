package in.nextit.operators;

public class No05TerneryOperator {

	public static void main(String[] args) {
		
		
		int age=17;
		
		
		String isEligible=(age>=18)?"Person is eligible for the voting":"Person is not eligible for the voting";
        System.out.println(isEligible);
        
        boolean isEligible1=(age>=18)?true:false;
        System.out.println(isEligible1);

	}

}
