package ETicaretDemo.dataAccess.abstracts;

import java.util.ArrayList;
import java.util.List;

import ETicaretDemo.entities.concretes.User;

public interface UserDao {

	List<User> users = new ArrayList<User>();
	List<User> getAll();
	void register(User user);
	void logIn(User user);
}
