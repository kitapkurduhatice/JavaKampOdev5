package business.abstracts;

import java.util.List;

import entities.concretes.User;

public interface ValidationService {
	String checkUser(User user);

	boolean isThere(User user, List<User> users);

}
