package ETicaretDemo;

import ETicaretDemo.business.abstracts.UserService;
import ETicaretDemo.business.concretes.AuthManager;
import ETicaretDemo.business.concretes.UserManager;
import ETicaretDemo.business.concretes.ValidationManager;
import ETicaretDemo.dataAccess.abstracts.UserDao;
import ETicaretDemo.dataAccess.concretes.HibernateUserDao;
import ETicaretDemo.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		UserDao userDao = new HibernateUserDao();
		
		User user1 = new User(1,"Gizem","Uçar","gizem@gmail.com","345634",true);
		User user2 =new User(2,"Ýrem","Uçar","irem@gmail.com","764276",true);
		User user3 = new User(3,"Gazi","Uçar","gazi@gmail.com","543298",true);
		
		UserService userService = new UserManager(new HibernateUserDao(), new AuthManager(), new ValidationManager(userDao));
        userService.register(user1);
        userService.register(user2);
        userService.register(user3);

        userService.signIn(userDao.getAll(),"gizem@gmail.com","345634");
        userService.signIn(userDao.getAll(),"irem@gmail.com","764276");
	}

}
