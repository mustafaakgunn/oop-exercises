package Interfaces;

public class DatabaseLogger implements Logger {

	@Override
	public void log(String name) {
		System.out.println("Database log is successful!");
		
	}

}
