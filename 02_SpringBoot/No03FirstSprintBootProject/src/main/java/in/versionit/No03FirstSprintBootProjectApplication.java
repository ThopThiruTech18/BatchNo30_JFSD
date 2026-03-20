package in.versionit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class No03FirstSprintBootProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(No03FirstSprintBootProjectApplication.class, args);

		int count = run.getBeanDefinitionCount();
		System.out.println(count);

		String[] beanDefinitionNames = run.getBeanDefinitionNames();

		int index=1;
		for (String beanName : beanDefinitionNames) {

			System.out.println((index++)+"  :  "+beanName);

		}
	}

}
