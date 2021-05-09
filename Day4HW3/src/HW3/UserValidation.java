package HW3;

public class UserValidation{


	//This class is manages UserValidation Process.
	
	public void validator(Users user) {
		
		if(user.getCitizenNumber()==user.getCitizenNumber() && user.getName() == user.getName() && user.getSurname()==user.getSurname() && user.getYearOfBirth()==user.getYearOfBirth()) {			
			
				System.out.println("User validation is successful!");
		}
		else
			System.out.println("User validation is failed!");	
		
		
	}	
}
