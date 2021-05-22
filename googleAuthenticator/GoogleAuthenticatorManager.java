package googleAuthenticator;

public class GoogleAuthenticatorManager {
	public void register(String eMail) {
		System.out.println("Google ile kayıt yapıldı : " + eMail);
	}
	
	public void login(String eMail) {
		System.out.println("Google ile giriş yapıldı : " + eMail);
	}

}
