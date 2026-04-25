package in.thiru;

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
		
		Employee emp1 = new Employee(1, "Arjun Singh", 20000.0);
		
		Employee save = empRepObj.save(emp1);
	}

}
