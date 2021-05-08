package day_4_homework_2;

public abstract class BaseCustomerManager implements CustomerService{

	@Override
	public void save(Customer customer) {
		System.out.println("Successfully saved to database!");	
	}

}
