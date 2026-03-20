package in.versionit;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements IUserRepository {
	
	
	public UserRepositoryImpl() {
		System.out.println("UserRepositoryImpl :: Constructor");
	}

	@Override
	public boolean saveUser(String name,String email,String Phno,String password) {
	
		
		System.out.println("Saved User data in the database succssfully");
		
		return true;
		
	}
	

}
