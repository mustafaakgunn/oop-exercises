package day_4_homework_2;

public class Main {

	public static void main(String[] args) {
		// Starbucks and Nero wants to save their customers to a database.
		
		
		BaseCustomerManager customermanager = new NeroCustomerManager();
		customermanager.save(new Customer(1,"Mustafa","Akgun","1997","12345678901"));
				
		BaseCustomerManager customermanager2 = new StarbucksCustomerManager();
		customermanager2.save(new Customer(1,"Mustafa","Akgun","1997","12345678901"));
	}

}
