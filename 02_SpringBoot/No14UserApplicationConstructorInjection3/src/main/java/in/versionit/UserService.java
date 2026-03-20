package in.versionit;

import org.springframework.stereotype.Service;

@Service
public class UserService {

	IUserRepository repository;

	PasswordConfig passwordUtil;

	EmailSender emailSender;

	public UserService(IUserRepository repository, PasswordConfig passwordUtil, EmailSender emailSender) {
		this.repository = repository;
		this.passwordUtil = passwordUtil;
		this.emailSender = emailSender;
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
