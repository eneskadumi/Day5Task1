package Day5Task1.core.abstracts;

import Day5Task1.entities.concretes.User;

public interface VerificationService {
	
	boolean isValid(User user);
	

}
