package day_4_homework_2;

public class NeroCustomerManager extends BaseCustomerManager implements CustomerService {

	@Override
		public void save(Customer customer) {
			System.out.println("Successfully saved to Nero database!");	
		}
		
	}

