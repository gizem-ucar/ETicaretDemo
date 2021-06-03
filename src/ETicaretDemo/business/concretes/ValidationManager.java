package ETicaretDemo.business.concretes;

import ETicaretDemo.business.abstracts.ValidityService;
import ETicaretDemo.dataAccess.abstracts.UserDao;
import ETicaretDemo.entities.concretes.User;

public class ValidationManager implements ValidityService {

	UserDao userDao;
	
	public ValidationManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public boolean isUsed(String email) {
		for(User user:UserDao.users) {
		if(email.equals(user.geteMail())) {
			System.out.println("�nceden kullan�lm�� e-posta");
			return false;
		}
	}	
	return true;
}
}