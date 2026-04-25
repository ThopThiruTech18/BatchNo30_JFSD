package in.thiru;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import in.thiru.entity.Employee;
import in.thiru.repo.EmployeeRepository;

@SpringBootApplication
public class N002JpaRepositoryApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(N002JpaRepositoryApplication.class, args);
		EmployeeRepository empRepObj = run.getBean(EmployeeRepository.class);

		// Sorting
//		List<Employee> all = empRepObj.findAll(Sort.by("empSal").descending());
//		
//		for (Employee employee : all) {
//			System.out.println(employee);
//		}

		// QBE

//		Employee emp1=new Employee();
//		emp1.setEmpId(44);
//		emp1.setEmpName("Dinesh");
//		emp1.setEmpSal(63000.0);
//		
//		
//		
//		List<Employee> all = empRepObj.findAll(Example.of(emp1));
//		
//		for (Employee employee : all) {
//			System.out.println(employee);
//		}

		Page<Employee> all = empRepObj.findAll(PageRequest.of(2, 5));

		List<Employee> content = all.getContent();

		for (Employee employee : content) {
			System.out.println(employee);

		}

	}

}
