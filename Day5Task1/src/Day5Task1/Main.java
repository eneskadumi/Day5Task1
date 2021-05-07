package Day5Task1;

import Day5Task1.bussines.abstracts.UserService;
import Day5Task1.bussines.concretes.UserManager;
import Day5Task1.core.concretes.GoogleUserVerificationAdapter;
import Day5Task1.core.concretes.ValidatorManager;
import Day5Task1.core.concretes.VerificationManager;
import Day5Task1.dataAcces.concretes.UserDao;
import Day5Task1.entities.concretes.User;

public class Main {

public static void main(String[] args) {

		User user1 = new User("Enes", "Kadumi", "enes10@hotmail.com", "enes12345");

		User user2 = new User("Ali", "Konar", "Alik28@gmail.com", "ali1");

		UserService service = new UserManager(new VerificationManager(), 
				new UserDao(), new ValidatorManager());
		
		
		service.register(user1);
		service.login(user1.getEmail(), user1.getPassword());
		
		System.out.println("-------------------");
		
		service.register(user2);
		service.login(user2.getEmail(), user2.getPassword());
		
		System.out.println(" ");
		System.out.println("------Google------");
		System.out.println(" ");
		
		UserService service2 = new UserManager(new GoogleUserVerificationAdapter(),
				new UserDao(), new ValidatorManager());
		
		service2.register(user1);

		System.out.println("-------------------");
		
		service2.register(user2);
		

	}
}
