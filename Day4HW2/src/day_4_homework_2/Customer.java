package day_4_homework_2;

public class Customer implements Entity{
 
	public int id;
	public String firstName;
	public String lastName;
	public String dateOfBirth;
	public String nationalityId;
	
	public Customer(int id, String firstName, String lastName, String dateOfBirth, String nationalityId) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalityId = nationalityId;
	}
	
	
	
} 
