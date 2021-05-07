package Day5Task1.bussines.abstracts;

import Day5Task1.entities.concretes.User;

public interface UserService {
	
	void register(User user);
	void login(String email, String password);
	

}
