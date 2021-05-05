package Interfaces;

public class SmsLogger implements Logger {

	@Override
	public void log(String name) {
		System.out.println("SMS log is successful!");	
	}

}
