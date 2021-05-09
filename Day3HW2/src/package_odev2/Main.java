package package_odev2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UserManager usermanager = new UserManager(new InstructorManager());
		
		
		System.out.println("-------------------------------------------------------------------");
		
		UserManager[] users = {new UserManager(), new StudentManager(), new InstructorManager()};
		
		usermanager.multipleAccountInfo(users);
		
	}

}

