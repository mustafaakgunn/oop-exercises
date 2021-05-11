package day5hw1.logInWithGoogle;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogInWithGoogle {
	
	//This class simulates "Log In with Google" Service...

	public void logIn(String email,String password) {
		
		boolean emailBool=false, passwordBool=false;
		
		String regex = "^(.+)@gmail(.+)$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		if(matcher.matches()==true) {
			emailBool=true;
		}
			
		
		if(password.length()>=6) {
				passwordBool=true;
			}
		
		if(emailBool==true && passwordBool==true) {	
			System.out.println("Google login is succeed!");		
		}
		else
			System.out.println("Google login failed!");		
	}
	
}
