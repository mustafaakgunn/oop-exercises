package day_4_homework_2;

public class StarbucksCustomerManager extends BaseCustomerManager implements CustomerCheckService,CustomerService {

	
	@Override
	public void save(Customer customer) {	
		System.out.println("Successfully saved to Starbucks database!");	
	}

	@Override
	public boolean CheckMernis(Customer customer) {
		return false;
	}

	
	

}
