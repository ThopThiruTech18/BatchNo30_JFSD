package in.versionit.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandlineRunner implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Commandline runner :: data is loading from the database");
		System.out.println("Commandline runner :: data is fetched from the 3rd party apis");
		
	}

	
}
