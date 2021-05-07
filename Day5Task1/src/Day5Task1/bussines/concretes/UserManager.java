package Day5Task1.bussines.concretes;

import Day5Task1.bussines.abstracts.UserService;
import Day5Task1.core.abstracts.ValidatorService;
import Day5Task1.core.abstracts.VerificationService;
import Day5Task1.dataAcces.abstracts.UserDaoService;
import Day5Task1.entities.concretes.User;

public class UserManager implements UserService{
	
	VerificationService verificationService;
	UserDaoService userDaoService;
	ValidatorService validatorService;

	public UserManager(VerificationService verificationService, UserDaoService userDaoService,
			ValidatorService validatorService) {
		super();
		this.verificationService = verificationService;
		this.userDaoService = userDaoService;
		this.validatorService = validatorService;
	}

	@Override
	public void register(User user) {
		if(!verificationService.isValid(user)) {
			System.out.println("Kullanýcý bilgileri yanlýþ. Kayýt baþarýsýz");
		}
		else if(!userDaoService.checkEmail(user)) {
			System.out.println("Bu mail adresi alýnmýþtýr. Yeni bir mail adresi giriniz");
			
		}
		
		else {
			userDaoService.add(user);
			validatorService.verificationMail();
		}
		
	}

	@Override
	public void login(String email, String password) {
		if(userDaoService.loginCheck(email, password)) {
			System.out.println("Login succes.");
		}else {
			System.out.println("Login failed.");
		}
		
	}

}
