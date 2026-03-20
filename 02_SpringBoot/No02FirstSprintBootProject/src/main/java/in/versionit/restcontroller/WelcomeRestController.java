package in.versionit.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//JWT,OAUTH2
@RestController
public class WelcomeRestController {
	
	public WelcomeRestController() {
		System.out.println("WelcomeRestController :: Constructor");
	}
	
	
	@GetMapping("/welcome")
	public String getWelcomeMessage()
	{
		return "Welcome to VersionIt";
	}

}
