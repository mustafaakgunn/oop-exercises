package Interfaces;

public class CustomerManager {

	
 /* For SOLID principle applied code, CustomerManager Class is constructing with Logger Interface...
	So, when It's constructing logging type is defined with this way, It protects system from any problem when 
	any change needed in future.(for example developer decided to remove EmailLogging method, no worries! just delete class.) 
	There are no dependency between classes!                                                                                   */
	
	private Logger logger;
	private Logger[] loggers;
	
	public CustomerManager(Logger logger) {
		this.logger = logger;
	}

	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}



	public void add(Customer customer) {
		System.out.println(" LOGGED! -> Customer Name-Surname: " + customer.getFirstName() +" "+ customer.getLastName() + "  Customer ID:" + customer.getId());		
		logger.log(customer.getFirstName());
	}

	
	public void delete(Customer customer) {
		System.out.println(" DELETED! -> Customer Name-Surname:" + customer.getFirstName() +" "+ customer.getLastName() + "  Customer ID:" + customer.getId());		
		logger.log(customer.getFirstName());
	}
	
	//multiple log-typed adding or deleting operation:
	
	public void multipleAdd(Customer customer) {
		
		for(Logger logger : loggers) {
			this.logger = logger;
		System.out.println(" LOGGED! -> Customer Name-Surname: " + customer.getFirstName() +" "+ customer.getLastName() + "  Customer ID:" + customer.getId());		
		logger.log(customer.getFirstName());
			}
		}	
	
	
	public void multipleDelete(Customer customer) {
		for(Logger logger : loggers) {
			this.logger = logger;
		System.out.println(" DELETED! -> Customer Name-Surname: " + customer.getFirstName() +" "+ customer.getLastName() + "  Customer ID:"  + customer.getId());		
		logger.log(customer.getFirstName());
		}
	}
	
}
