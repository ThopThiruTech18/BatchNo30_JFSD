package in.versionit.encapsulation;

public class Employee02 {

	// 1)Private variablee
	private int empId;
	private String empName;
	private double empSalary;
	private int empAge;

	// 2) getters should be public(for read access)
	public int getEmpId() {
		return this.empId;
	}

	public String getEmpName() {
		return this.empName;
	}

	public double getEmpSalary() {
		return this.empSalary;
	}

	public int getEmpAge() {
		return this.empAge;
	}

	// 3) setters should be public(for insert/update access)

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	
	//4) Validations

	public void setEmpAge(int empAge) {

		if (empAge > 0) {
			this.empAge = empAge;
		} else {
			System.out.println("Please give valid +ve input");
		}

	}

	public static void main(String[] args) {

		
		//className cls=new ClassName();
		Employee02 emp = new Employee02();
		emp.setEmpId(1111);
		emp.setEmpName("Hari");
		emp.setEmpSalary(100000);
		emp.setEmpAge(-6);

		System.out.println("Employee Id : " + emp.getEmpId());
		System.out.println("Employee Name : " + emp.getEmpName());
		System.out.println("Employee Salary : " + emp.getEmpSalary());
		System.out.println("Employee Age : " + emp.getEmpAge());

	}

}
