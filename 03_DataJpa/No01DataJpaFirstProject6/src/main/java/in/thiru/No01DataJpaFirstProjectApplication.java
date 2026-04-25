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
		
		
		
		Iterable<Employee> employees = empRepObj.findAll();
		
		for (Employee employee : employees) {
			
			
			System.out.println(employee);
			
		}
		
		
		
		
	}

}
