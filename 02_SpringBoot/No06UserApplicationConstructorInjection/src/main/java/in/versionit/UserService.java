package in.versionit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	IUserRepository repository;

	
	@Autowired
	public UserService(IUserRepository repository)
	{
		this.repository=repository;
	}

	public UserService() {
		System.out.println("UserService :: Constructor");
	}

	public void getNameById(Integer id) {
		String name = repository.findNameById(id);

		System.out.println(name);

	}

}
