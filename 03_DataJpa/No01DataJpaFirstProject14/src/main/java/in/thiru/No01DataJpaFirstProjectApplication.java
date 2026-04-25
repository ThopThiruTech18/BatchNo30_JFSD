package in.thiru;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.thiru.entity.Employee;
import in.thiru.repository.EmployeeRepository;

@SpringBootApplication
public class No01DataJpaFirstProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(No01DataJpaFirstProjectApplication.class, args);

		EmployeeRepository empRepObj = run.getBean(EmployeeRepository.class);

//		empRepObj.deleteAllById(Arrays.asList(60, 61, 62));
//
//		List<Employee> employees = empRepObj.getEmployeesHql();
//
//		for (Employee employee : employees) {
//
//			System.out.println(employee);
//
//		}
//
//		System.out.println("---------------------------------");
//
//		List<Employee> employeesSql = empRepObj.getEmployeesSql();
//		for (Employee employee : employeesSql) {
//			System.out.println(employee);
//		}

//		Employee employeeByIdHql = empRepObj.getEmployeeByIdHql(100);
//		System.out.println(employeeByIdHql);

//		Employee employeeByIdSql = empRepObj.getEmployeeByIdSql(99);
//		System.out.println(employeeByIdSql);

//		List<Employee> employees = empRepObj.getEmployeeByNameHql("Bhavesh");
//		
//		for (Employee employee : employees) {
//			System.out.println(employee);
//			
//		}

//		List<Employee> employees = empRepObj.getEmployeeByNameSql("Balaji");
//		
//		for (Employee employee : employees) {
//			
//			System.out.println(employee);
//			
//		}

//		List<Employee> employeeBySalaryHql = empRepObj.getEmployeeBySalaryHql(20000.0);
//		
//		for (Employee employee : employeeBySalaryHql) {
//			
//			System.out.println(employee);
//			
//		}

//		List<Employee> employeeBySalarySql = empRepObj.getEmployeeBySalarySql(61000.0);
//		for (Employee employee : employeeBySalarySql) {
//			System.out.println(employee);
//
//		}
		
		
//		empRepObj.deleteEmployeeById(1);
		
//		empRepObj.deleteEmployeeByIdSql(100);
		
		
		Employee emp1=new Employee(101, "thirumalesh", 20000.0);
		
		empRepObj.save(emp1);

	}

}
