package in.versionit.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope("singleton")
public class EmployeeController {

	public EmployeeController() {
		System.out.println("EmployeeController :: Constructor");
	}

}
