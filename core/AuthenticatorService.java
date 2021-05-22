package core;

import entities.concretes.User;

public interface AuthenticatorService {
	void register(User user);
	void login(User user);

}
