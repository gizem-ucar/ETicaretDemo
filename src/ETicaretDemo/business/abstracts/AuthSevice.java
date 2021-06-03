package ETicaretDemo.business.abstracts;

public interface AuthSevice {

	boolean firstNameKontrol(String firstName);
	boolean lastNameKontrol(String lastName);
	boolean eMailKontrol(String email);
	boolean passwordKontol(String password);
	
}
