package in.versionit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class UserApplication {

	public static void main(String[] args) {
		
		System.out.println("Main method started...");
		ConfigurableApplicationContext context = SpringApplication.run(UserApplication.class, args);
		
		UserService userServiceObject = context.getBean(UserService.class);
		
		userServiceObject.register("Thiru", "thiru@gmail.com", "946546541", "thiru@123");
		System.out.println("Main method ended...");
	
	}

}
