package day_4_homework_2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BaseCustomerManager customermanager = new NeroCustomerManager();
		customermanager.save(new Customer(1,"Mustafa","Akgun","1997","27080074806"));
				
		BaseCustomerManager customermanager2 = new StarbucksCustomerManager();
		customermanager2.save(new Customer(1,"Mustafa","Akgun","1997","27080074806"));
	}

}
