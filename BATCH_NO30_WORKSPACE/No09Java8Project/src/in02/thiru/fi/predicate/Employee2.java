package in02.thiru.fi.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Employee2 {

	String name;
	String location;
	String department;

	public Employee2(String name, String location, String department) {
		this.name = name;
		this.location = location;
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", location=" + location + ", department=" + department + "]";
	}

	public static void main(String[] args) {

		Employee2 e1 = new Employee2("Anil", "Chennai", "DevOps");
		Employee2 e2 = new Employee2("Rani", "Pune", "Networking");
		Employee2 e3 = new Employee2("Thirumalesh", "Hyd", "DB");
		Employee2 e4 = new Employee2("Ganesh", "Hyd", "DB");

		List<Employee2> employeeList = Arrays.asList(e1, e2, e3, e4);

		Predicate<Employee2> empNamePredicate = n -> n.name.startsWith("T");
		Predicate<Employee2> empLocationPredicate = l -> l.location.equals("Hyd");
		Predicate<Employee2> empDepartmentPredicate = d -> d.department.equals("DB");

		Predicate<Employee2> p = empNamePredicate.and(empLocationPredicate).and(empDepartmentPredicate);

		for (Employee2 employee : employeeList) {

			if (p.test(employee)) {
				System.out.println(employee);
			}

		}

	}

}
