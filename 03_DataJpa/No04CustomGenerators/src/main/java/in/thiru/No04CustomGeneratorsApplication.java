package in.thiru;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.thiru.entity.Orders;
import in.thiru.repo.OrdersRepository;

@SpringBootApplication
public class No04CustomGeneratorsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(No04CustomGeneratorsApplication.class, args);
	
		OrdersRepository orderRepository = run.getBean(OrdersRepository.class);
		
		
		List<Orders> list = List.of(
			    new Orders("Laptop"),
			    new Orders("Mobile"),
			    new Orders("Keyboard"),
			    new Orders("Mouse"),
			    new Orders("Monitor"),
			    new Orders("Printer"),
			    new Orders("Tablet"),
			    new Orders("Headphones"),
			    new Orders("Speaker"),
			    new Orders("Smart Watch")
			);

			orderRepository.saveAll(list);
		
		
	
	
	}

}
