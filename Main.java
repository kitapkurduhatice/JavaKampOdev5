import business.abstracts.UserService;
import business.concretes.UserManager;
import core.TestAuthenticatorAdapter;
import core.googleAuthenticatorAdapter;
import dataAcces.concretes.HibernateUserDao;
import entities.concretes.User;
import business.concretes.UserValidator;

public class Main {

	public static void main(String[] args) {
		UserService userService = new UserManager(new HibernateUserDao(), new UserValidator(),
				new googleAuthenticatorAdapter());

		User user1 = new User(1, "Ufuk", "Bakır", "ufukk@gmail.com", "111111");

		userService.register(user1);

		userService.login(user1);
		
		//-------------------------------------------------------------------
		
		UserService userServiceTest = new UserManager(new HibernateUserDao(), new UserValidator(),
				new TestAuthenticatorAdapter());

		User user2 = new User(2, "Pelin", "Pil", "pilli@gmail.com", "1111222");

		userServiceTest.register(user2);

		userServiceTest.login(user2);

	}

}
