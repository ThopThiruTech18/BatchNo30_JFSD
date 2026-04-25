package in.thiru;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.thiru.entity.Book;
import in.thiru.repository.BookRepository;

@SpringBootApplication
public class No03GeneratorsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(No03GeneratorsApplication.class, args);
	
		BookRepository bookRepoObj = run.getBean(BookRepository.class);
		
		
		List<Book> books = List.of(
			    new Book(1, "Java Basics", 299.0),
			    new Book(2, "Spring Boot Guide", 499.0),
			    new Book(3, "Microservices Architecture", 699.0),
			    new Book(4, "Hibernate Deep Dive", 399.0),
			    new Book(5, "Data Structures in Java", 599.0),
			    new Book(6, "System Design Basics", 799.0),
			    new Book(7, "Clean Code", 450.0),
			    new Book(8, "Design Patterns", 550.0),
			    new Book(9, "Spring Security", 620.0),
			    new Book(10, "REST API Development", 480.0),
			    new Book(11, "Docker for Beginners", 530.0),
			    new Book(12, "Kubernetes Guide", 750.0),
			    new Book(13, "AWS for Developers", 820.0),
			    new Book(14, "Java Multithreading", 610.0),
			    new Book(15, "Java 8 Features", 470.0),
			    new Book(16, "Spring MVC", 390.0),
			    new Book(17, "React Basics", 300.0),
			    new Book(18, "Angular Complete Guide", 650.0),
			    new Book(20, "Full Stack Development", 900.0),
			    new Book(20, "AI for Beginners", 1000.0)
			);
		
		
		List<Book> saveAll = bookRepoObj.saveAll(books);
		
		if(saveAll != null)
		{
			System.out.println("The books data inserted successfully");
		}
		else
		{
			System.out.println("The books not inserted");
		}
		
	
	
	
	}

}
