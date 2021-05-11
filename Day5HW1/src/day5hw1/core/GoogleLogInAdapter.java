package day5hw1.core;
import day5hw1.logInWithGoogle.LogInWithGoogle;

public class GoogleLogInAdapter implements GoogleLogInManagerAdapter{
	
	
	@Override
	public void login(String email, String password) {
		LogInWithGoogle login = new LogInWithGoogle();
		login.logIn(email, password);
	}
	
}
