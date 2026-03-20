package in.versionit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.versionit.service.EmployeeService;

@SpringBootApplication
public class No12FirstSprintBootProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(No12FirstSprintBootProjectApplication.class, args);
	
	
		EmployeeService empService = run.getBean(EmployeeService.class);
		
		empService.living();
	}

}
