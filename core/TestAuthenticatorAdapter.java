package core;

import entities.concretes.User;

public class TestAuthenticatorAdapter implements AuthenticatorService{

	@Override
	public void register(User user) {
		System.out.println("Test ile kayit yapildi : " + user.geteMail());
		
	}

	@Override
	public void login(User user) {
		System.out.println("Test ile giriş yapildi : " + user.geteMail());
		
	}

}
