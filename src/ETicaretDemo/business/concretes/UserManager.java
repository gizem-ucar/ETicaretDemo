package ETicaretDemo.business.concretes;

import java.util.List;

import ETicaretDemo.business.abstracts.AuthSevice;
import ETicaretDemo.business.abstracts.UserService;
import ETicaretDemo.business.abstracts.ValidityService;
import ETicaretDemo.dataAccess.abstracts.UserDao;
import ETicaretDemo.dataAccess.concretes.HibernateUserDao;
import ETicaretDemo.entities.concretes.User;

public class UserManager implements UserService {

	UserDao userDao;
	ValidityService validityService;
	AuthSevice authService;
	
	public UserManager(UserDao userDao, AuthSevice authService, ValidityService validityService) {
        this.userDao = userDao;
        this.authService = authService;
        this.validityService = validityService;
    }

	@Override
	 public void register(User user) {
        if (validityService.isUsed(user.geteMail()) &&
                authService.firstNameKontrol(user.getFirstName()) &&
                authService.lastNameKontrol(user.getLastName()) &&
                authService.eMailKontrol(user.geteMail()) &&
                authService.passwordKontol(user.getParola())) {
            userDao.register(user);
            System.out.println(user.geteMail() + " mailine doğrulama e-postası gönderildi. Lütfen doğrulama işlemini yapınız.");
            System.out.println("Doğrulama yapıldı.Sisteme kaydınız alındı.");
            System.out.println("**************************************************************************************************");
        }

    }

	@Override
	public void signIn(List<User> users, String email, String password) {

        for (User user : users) {
            if (user.geteMail().equals(email) && user.getParola().equals(password)) {
                System.out.println("**Giriş Başarılı** >>> " + user.getFirstName() + user.getLastName());
                return;
            }
        }

        System.out.println("Giriş başarısız Email ya da parolanızı kontrol ediniz.");

    }

}
