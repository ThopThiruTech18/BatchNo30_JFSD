package in.versionit;

import org.springframework.stereotype.Component;

@Component
public class EmailSender {
	
	
	public EmailSender() {
		System.out.println("EmailSender :: Constructor");
	}
	
	
	public void sendEmail()
	{
		System.out.println("Email sent successfully");
		//main logic
	}
	

}
