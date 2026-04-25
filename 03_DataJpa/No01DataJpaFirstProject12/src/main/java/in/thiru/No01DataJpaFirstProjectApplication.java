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

		
//		List<Employee> byEmpName = empRepObj.findByEmpName("Ravi");
//		System.out.println(byEmpName);
//		
		
		
		
//		List<Employee> byEmpSal = empRepObj.getByEmpSal(100000.0);
//		System.out.println(byEmpSal);
		
//		List<Employee> byEmpSalBetween = empRepObj.findByEmpSalBetween(70000.0, 100000.0);
//		System.out.println(byEmpSalBetween);
		
		List<Employee> byEmpSalLessThan = empRepObj.readByEmpSalLessThan(25000.0);
		System.out.println(byEmpSalLessThan);
		
		
		
		
		
	

	

	}

}
