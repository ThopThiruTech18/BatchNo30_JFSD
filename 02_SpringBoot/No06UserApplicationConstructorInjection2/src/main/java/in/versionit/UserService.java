package in.versionit;

import org.springframework.stereotype.Service;

@Service
public class UserService {

	IUserRepository repository;

	public UserService(IUserRepository repository) {
		this.repository = repository;
	}

	public void getNameById(Integer id) {
		String name = repository.findNameById(id);

		System.out.println(name);

	}

}
