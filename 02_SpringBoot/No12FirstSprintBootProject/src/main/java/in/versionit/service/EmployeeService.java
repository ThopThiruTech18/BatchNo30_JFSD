package in.versionit.service;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeService implements InitializingBean,DisposableBean{

	public void living()
	{
		System.out.println("living...");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Ended...");
		
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("started...");
		
	}
	
	
	
	
	
	
			

}
