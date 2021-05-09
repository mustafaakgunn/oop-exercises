package package_odev2;

public class Student extends User {
	
	
	private int age;
	private String paymentPreference;
	private int contactNumber;
	private boolean emailFeedPreference;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getPaymentPreference() {
		return paymentPreference;
	}
	public void setPaymentPreference(String paymentPreference) {
		this.paymentPreference = paymentPreference;
	}
	
	public int getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	public boolean isEmailFeedPreference() {
		return emailFeedPreference;
	}
	public void setEmailFeedPreference(boolean emailFeedPreference) {
		this.emailFeedPreference = emailFeedPreference;
	}
	
	

}
