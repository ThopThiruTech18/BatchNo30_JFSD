package in.versionit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"in.versionit","com.tcs.controller"})
public class No01FirstSprintBootProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(No01FirstSprintBootProjectApplication.class, args);
	}

}
