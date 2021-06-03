package ETicaretDemo.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import ETicaretDemo.dataAccess.abstracts.UserDao;
import ETicaretDemo.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	List<User> users = new ArrayList<User>();

	@Override
	public List<User> getAll() {
		return users;
	}

	@Override
	public void register(User user) {
		users.add(user);
		System.out.println("Kullanýcý sisteme eklendi: "+ user.getFirstName()  + " " + user.getLastName());
	}

	@Override
	public void logIn(User user) {
		System.out.println("Sisteme giriþ baþarýlý "+ user.getFirstName());		
	}

}
