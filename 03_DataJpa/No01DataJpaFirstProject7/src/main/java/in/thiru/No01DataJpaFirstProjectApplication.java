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
		
		
		boolean isPersonAvailable = empRepObj.existsById(961);
		if(isPersonAvailable)
		{
			System.out.println("Employee is present");
		}
		else
		{
			System.out.println("Employee is not present");
		}
		
		
		
		
		
	}

}
