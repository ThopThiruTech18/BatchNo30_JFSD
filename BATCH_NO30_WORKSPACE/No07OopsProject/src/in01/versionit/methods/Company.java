package in01.versionit.methods;

public class Company {
	
	public static void main(String[] args) {
		
		Employee emp1=new Employee();
		emp1.takeInputs("charan", 22, 15000);
		emp1.printData();
		
		System.out.println("-----------------------");
		Employee emp2=new Employee();
		emp2.takeInputs("vinay", 15, 20000);
		emp2.printData();
		
		System.out.println("-----------------------");
		Employee emp3=new Employee();
		emp3.takeInputs("sunny", 18, 25000);
		emp3.printData();
		
		System.out.println("-----------------------");
		Employee emp4=new Employee();
		emp4.takeInputs("bunny", 25, 16000);
		emp4.printData();
		
		
		
	}

}
