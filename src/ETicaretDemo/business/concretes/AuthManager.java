package ETicaretDemo.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import ETicaretDemo.business.abstracts.AuthSevice;

public class AuthManager implements AuthSevice {

	@Override
	public boolean firstNameKontrol(String firstName) {
		if(firstName.length()<2) {
			return false;
		}
		return true;
	}

	@Override
	public boolean lastNameKontrol(String lastName) {
		if(lastName.length()<2) {
			return false;
		}
		return true;
	}

	@Override
	public boolean eMailKontrol(String email) {
		 String regex = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9]))\\.){3}(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9])|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";
	        //"^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(email);
	        if (!matcher.matches()) {
	            System.out.println("Ge�ersiz email!!");
	            return false;
	        }
	        return true;
	}

	@Override
	public boolean passwordKontol(String password) {
		if (password.length()<6) {
			System.out.println("Ge�ersiz �ifre!");
			return false;
		}
		return true;
	}

}
