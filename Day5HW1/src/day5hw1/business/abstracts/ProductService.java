package day5hw1.business.abstracts;

import day5hw1.entities.concretes.Users;

public interface ProductService {

	
	void logIn(String email,String password,Users user);
	void emailValidationMailSender();
	boolean verifyMyEmail(boolean clickedOrNot);
	
}
