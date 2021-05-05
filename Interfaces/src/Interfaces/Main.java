package Interfaces;

public class Main {

	public static void main(String[] args) {

		
		//Interfaced classes are used in constructor. DEPENDENCY INJECTION APPLY.
		
		CustomerManager customermanager = new CustomerManager(new SmsLogger());
		Customer customer = new Customer("Mustafa","Akgün",1);
		customermanager.add(customer);
		
		System.out.println("********************************************************************");
		
		
		//Multiple Add method apply is here... Using Interfaced classes' array as a constructor parameter...
		Logger[] loggers = {new EmailLogger(), new FileLogger(), new SmsLogger(), new DatabaseLogger()};
		CustomerManager customermanager2 = new CustomerManager(loggers);
		customermanager2.multipleAdd(customer);
		
		
		
	}

}
