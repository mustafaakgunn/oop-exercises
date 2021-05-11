package day5hw1.entities.abstracts;

public interface UserInputChecker {

	public boolean emailChecker(String email);
	public boolean passwordChecker(String password);
	public boolean nameSurnameChecker(String password);
}
