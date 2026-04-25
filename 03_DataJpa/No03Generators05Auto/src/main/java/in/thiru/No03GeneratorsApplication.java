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
			    new Book("Java Basics", 299.0),
			    new Book( "Spring Boot Guide", 499.0),
			    new Book("Microservices Architecture", 699.0),
			    new Book("Hibernate Deep Dive", 399.0),
			    new Book("Data Structures in Java", 599.0),
			    new Book("System Design Basics", 799.0),
			    new Book("Clean Code", 450.0),
			    new Book("Design Patterns", 550.0),
			    new Book("Spring Security", 620.0),
			    new Book("REST API Development", 480.0),
			    new Book("Docker for Beginners", 530.0),
			    new Book("Kubernetes Guide", 750.0),
			    new Book("AWS for Developers", 820.0),
			    new Book("Java Multithreading", 610.0),
			    new Book("Java 8 Features", 470.0),
			    new Book("Spring MVC", 390.0),
			    new Book("React Basics", 300.0),
			    new Book("Angular Complete Guide", 650.0),
			    new Book("Full Stack Development", 900.0),
			    new Book("AI for Beginners", 1000.0)
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
