package Day5Task1.dataAcces.concretes;

import java.util.ArrayList;
import java.util.List;

import Day5Task1.dataAcces.abstracts.UserDaoService;
import Day5Task1.entities.concretes.User;

public class UserDao implements UserDaoService {

	List<User> users = new ArrayList<>();

	@Override
	public void add(User user) {

		users.add(user);
		System.out.println(user.getFirstName().toUpperCase() 
				+ " " + user.getLastName().toUpperCase() + " Eklendi.");

	}

	@Override
	public boolean checkEmail(User user) {
		for(User u : users) {
			if(u.getEmail()==user.getEmail()) {
				return false;
			}	
		}
		return true;
	}

	@Override
	public boolean loginCheck(String email, String password) {
		for(User user : users) {
			if(user.getEmail()==email && user.getPassword() == password) {
				return true;
			}
		}
		return false;
	}

}
