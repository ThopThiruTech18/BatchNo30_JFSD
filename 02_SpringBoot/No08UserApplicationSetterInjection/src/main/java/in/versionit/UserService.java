package in.versionit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	
	IUserRepository repository;

	PasswordConfig passwordUtil;

	EmailSender emailSender;
	
	
	
	@Autowired
	public void setRepository(IUserRepository repository) {
		this.repository = repository;
	}

	@Autowired
	public void setPasswordUtil(PasswordConfig passwordUtil) {
		this.passwordUtil = passwordUtil;
	}

	@Autowired
	public void setEmailSender(EmailSender emailSender) {
		this.emailSender = emailSender;
	}

	public UserService() {
		System.out.println("UserService :: Constructor");
	}

	public void register(String name, String email, String phno, String password) {

		boolean encryptPasswrd = passwordUtil.encryptPasswrd();

		if (encryptPasswrd) {
			boolean saveUser = repository.saveUser(name, email, phno, password);

			if (saveUser) {
				emailSender.sendEmail();

				System.out.println("Registration complted successully");
			}
		}

	}

}
