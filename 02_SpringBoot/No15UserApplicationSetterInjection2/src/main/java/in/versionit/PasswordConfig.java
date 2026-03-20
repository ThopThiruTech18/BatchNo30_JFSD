package in.versionit;

import org.springframework.stereotype.Component;

@Component
public class PasswordConfig {

	public PasswordConfig() {
		System.out.println("PasswordUtil :: Constructor");
	}

	public boolean encryptPasswrd() {
		System.out.println("Encrypted....");

		// main

		
		return true;
	}

}
