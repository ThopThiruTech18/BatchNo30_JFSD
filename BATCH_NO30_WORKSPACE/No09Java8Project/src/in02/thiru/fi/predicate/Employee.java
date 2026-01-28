package in02.thiru.fi.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Employee {

	String name;
	String location;
	String department;

	public Employee(String name, String location, String department) {
		this.name = name;
		this.location = location;
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", location=" + location + ", department=" + department + "]";
	}

	public static void main(String[] args) {

		Employee e1 = new Employee("Anil", "Chennai", "DevOps");
		Employee e2 = new Employee("Rani", "Pune", "Networking");
		Employee e3 = new Employee("Thirumalesh", "Hyd", "DB");  //1
		Employee e4 = new Employee("Ganesh", "Hyd", "DB");  //2

		List<Employee> employeeList = Arrays.asList(e1, e2, e3, e4);

		Predicate<Employee> empNamePredicate = n -> n.name.startsWith("T");
		Predicate<Employee> empLocationPredicate = l -> l.location.equals("Hyd");
		Predicate<Employee> empDepartmentPredicate = d -> d.department.equals("DB");

		Predicate<Employee> p = empNamePredicate.or(empLocationPredicate).or(empDepartmentPredicate);

		for (Employee employee : employeeList) {

			if (p.test(employee)) {
				System.out.println(employee);
			}

		}

	}

}
