package day5hw1.business.concretes;

import day5hw1.business.abstracts.ProductService;
import day5hw1.entities.concretes.Users;

import day5hw1.dataAccess.abstracts.ProductDao;

public class ProductManager implements ProductService{
	
	public ProductManager(ProductDao productDao,Users user) {
		if(user.getSignUpProcessTracker()==true) {
		System.out.println("Registration is succeed!");
		productDao.add(user);
		emailValidationMailSender();
		}
		else
			System.out.println("Registration is failed. Try again considering the warnings.");	
	}
	
	@Override
	public void emailValidationMailSender() {
			System.out.println("Email verification email has been sent. Check your inbox.");
	}

	@Override
	public boolean verifyMyEmail(boolean clickedOrNot) {
		if (clickedOrNot == true) {
			System.out.println("Email verification is succeed!");
		return true;}
		else if(clickedOrNot == false) {
			System.out.println("Email verification failed. We're sending your verification mail again.");
		    emailValidationMailSender();    
		    return false; 
		}
		return false; 
	}
	
	@Override
	public void logIn(String email, String password,Users user) {
		
		if(email.equals(user.getEmail()) && password.equals(user.getPassword())) {
			System.out.println("Successfully logged-in!");
		}
		else
			System.out.println("Wrong email or password, try again.");
		
	}

}
