package in.versionit.encapsulation;

public class Employee {

	// 1)Private variable
	private int empId;
	private String empName;
	private double empSalary;
	private int empAge;

	//2) getters should be public(for read access)
	public int getEmpId() {return this.empId;}

	public String getEmpName() {return this.empName;}

	public double getEmpSalary() {return this.empSalary;}

	public int getEmpAge() {return this.empAge;}
	
	//3) setters should be public(for insert/update access)
	
	public void setEmpId(int empId){this.empId=empId;}
	
	public void setEmpName(String empName){this.empName=empName;}
	
	public void setEmpSalary(double empSalary){this.empSalary=empSalary;}
	
	public void setEmpAge(int empAge) {this.empAge=empAge;}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Employee emp=new Employee();
		System.out.println(emp.getEmpId());
		System.out.println(emp.getEmpName());
		System.out.println(emp.getEmpSalary());
		System.out.println(emp.getEmpAge());
		
				
		
		
		
	}

	

}
