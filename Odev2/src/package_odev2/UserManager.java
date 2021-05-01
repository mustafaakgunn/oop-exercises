package package_odev2;

public class UserManager {
	
	
	public UserManager() {		
		
	}
	
	
	public UserManager(UserManager usermanage) {		
		usermanage.userInfo();		
	}
	
	
	public void multipleAccountInfo(UserManager[] usermanage) {
		
		for(UserManager user : usermanage ) {
			user.userInfo();
		}
		
	}
	
	public void userInfo() {
		System.out.println("It's a kodlama.io account.");
	}
	
	public static void logIn()  {
		System.out.println("Successfully logged in!");
	}
	
	public static void logOut()  {
		System.out.println("Successfully logged out!");
	}

	
	
}
