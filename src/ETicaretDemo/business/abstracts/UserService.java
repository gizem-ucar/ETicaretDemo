package ETicaretDemo.business.abstracts;

import java.util.List;

import ETicaretDemo.entities.concretes.User;

public interface UserService {

	void register(User user);
	void signIn(List<User> users, String email, String password);
}
