package HW3;

public class Users extends UserValidation{


	//This class includes user informations.
	
	private int userId;
	private String citizenNumber;
	private String name;
	private String surname;
	private int yearOfBirth;
	
	
	public Users(int userId, String citizenNumber, String name, String surname, int yearOfBirth) {
		super();
		this.userId = userId;
		this.citizenNumber = citizenNumber;
		this.name = name;
		this.surname = surname;
		this.yearOfBirth = yearOfBirth;
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getCitizenNumber() {
		return citizenNumber;
	}
	public void setCitizenNumber(String citizenNumber) {
		this.citizenNumber = citizenNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getYearOfBirth() {
		return yearOfBirth;
	}
	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	
	
	
}
