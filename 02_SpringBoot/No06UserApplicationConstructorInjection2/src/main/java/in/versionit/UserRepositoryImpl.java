package in.versionit;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements IUserRepository {
	
	
	public UserRepositoryImpl() {
		System.out.println("UserRepositoryImpl :: Constructor");
	}

	@Override
	public String findNameById(Integer id) {
		
		if(id == 101)
			return "varun";
		else if(id == 102)
			return "kiran";
		else if(id == 103)
		    return "charan";
		else
			return "Please provide the valid input";
	}
	

}
