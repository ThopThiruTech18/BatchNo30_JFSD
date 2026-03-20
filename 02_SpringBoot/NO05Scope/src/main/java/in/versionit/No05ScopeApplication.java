package in.versionit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.versionit.controller.EmployeeController;

@SpringBootApplication
public class No05ScopeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(No05ScopeApplication.class, args);
	
		EmployeeController employeeController1 = run.getBean(EmployeeController.class);
		EmployeeController employeeController2 = run.getBean(EmployeeController.class);
		EmployeeController employeeController3 = run.getBean(EmployeeController.class);
		
		System.out.println(employeeController1.hashCode());
		System.out.println(employeeController2.hashCode());
		System.out.println(employeeController3.hashCode());
	
	}

}
