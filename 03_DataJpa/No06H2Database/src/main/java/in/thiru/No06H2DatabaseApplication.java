package in.thiru;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.thiru.service.ProductService;

@SpringBootApplication
public class No06H2DatabaseApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(No06H2DatabaseApplication.class, args);
	
	ProductService productService = run.getBean(ProductService.class);
	
	productService.insertProducts();
	
	}

}
