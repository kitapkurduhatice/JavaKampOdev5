package business.concretes;

import business.abstracts.UserService;
import business.abstracts.ValidationService;
import core.AuthenticatorService;
import dataAcces.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService{

	private UserDao dao;
	private ValidationService validator;
	private AuthenticatorService authenticator;
	
	public UserManager(UserDao dao, ValidationService validator, AuthenticatorService authenticator) {
		super();
		this.dao = dao;
		this.validator = validator;
		this.authenticator = authenticator;
	}

	public void register(User user) {
		String checkUser = validator.checkUser(user);
		
		if (checkUser != null) {
			System.out.println(checkUser);
			return;
		}
		
		if (validator.isThere(user, dao.getAll())) {
			System.out.println("E-Posta daha önce kullanýlmýþ.");
			return;
		}
		
		dao.register(user);
		authenticator.register(user);
	}

	public void login(User user) {
		if (!validator.isThere(user, dao.getAll())) {
			System.out.println("Bu kullanýcý mevcut deðil.");
			return;
		}else {
			dao.login(user);
			authenticator.login(user);
		}
	}

}
