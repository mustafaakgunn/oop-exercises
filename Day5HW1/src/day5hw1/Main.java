package day5hw1;

import day5hw1.business.concretes.ProductManager;
import day5hw1.core.GoogleLogInAdapter;
import day5hw1.entities.concretes.*;
import day5hw1.dataAccess.concretes.*;

public class Main {

	public static void main(String[] args) {
		
		
		//Name, Surname, Email and Password check is directly happens after declared in struct.
		Users user = new Users("Mustafa","Akgun","mustafaakgundev@gmail.com","122323232");

		//hibernate simulation and Email verification process happens here.
		ProductManager productManager = new ProductManager(new HibernateSimulator(),user);
		productManager.verifyMyEmail(true);
		
		//Log-in Process check is here.
		productManager.logIn("mustafaakgundev@gmail.com","122323232",user);
		
		//Google login system is out service. I adapted this service with an adapter in "core" package.
		//It's checks email with regex (@gmail pattern), and password with Length.
		GoogleLogInAdapter googleLogin = new GoogleLogInAdapter();
		googleLogin.login("googlemail@gmail.com","123456");
		
		
		
		/*OUTPUT
		
		Email is OK.
		Password is OK.
		Name and Surname is OK.
		Registration is succeed!
		Successfully added with Hibernate:Mustafa
		Email verification email has been sent. Check your inbox.
		Email verification is succeed!
		Successfully logged-in!
		Google login is succeed!

		*/
		
	}

}
