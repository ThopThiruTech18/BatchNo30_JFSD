package in.thiru;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.thiru.service.BookService;

@SpringBootApplication
public class No04CompositePrimaryKeyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(No04CompositePrimaryKeyApplication.class, args);

	
		BookService bookService = run.getBean(BookService.class);
		
		bookService.insertBook();
	}

}
