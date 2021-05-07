package Day5Task1.dataAcces.abstracts;

import Day5Task1.entities.concretes.User;

public interface UserDaoService {
	
	void add(User user);
	boolean checkEmail(User user);
	boolean loginCheck(String email, String password);
	

}
