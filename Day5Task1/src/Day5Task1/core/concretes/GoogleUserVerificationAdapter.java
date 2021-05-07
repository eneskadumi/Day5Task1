package Day5Task1.core.concretes;

import Day5Task1.core.abstracts.VerificationService;
import Day5Task1.entities.concretes.User;
import Day5Task1.googleValidationService.GoogleVerificationService;

public class GoogleUserVerificationAdapter implements VerificationService {

	@Override
	public boolean isValid(User user) {
		GoogleVerificationService googleUserValidService = new GoogleVerificationService();
		return googleUserValidService.isValidGoogle();

	}

}
