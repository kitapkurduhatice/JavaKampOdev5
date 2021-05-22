package core;

import entities.concretes.User;
import googleAuthenticator.GoogleAuthenticatorManager;

public class googleAuthenticatorAdapter implements AuthenticatorService {

	@Override
	public void register(User user) {
		GoogleAuthenticatorManager auth = new GoogleAuthenticatorManager();
		auth.register(user.geteMail());
	}

	@Override
	public void login(User user) {
		GoogleAuthenticatorManager auth = new GoogleAuthenticatorManager();
		auth.login(user.geteMail());
	}

}
